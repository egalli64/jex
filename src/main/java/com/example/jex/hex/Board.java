/*
    Hex - Logic for a Hex game
    https://en.wikipedia.org/wiki/Hex_(board_game)

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.hex;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The board, a rhombus scaling rightward where each cell is a hexagon
 */
public class Board {
    public static final int DEFAULT_SIZE = 11;

    /**
     * Placeholder for non-assigned cell
     */
    private final static Pawn emptyCell = new Pawn(Color.NONE);

    /**
     * Extra nodes, to ease the job of checking the winner
     */
    private final List<Pawn> owners;

    private final List<List<Pawn>> cells;

    /**
     * Private constructor, to be used by BoardBuilder - create an empty board
     *
     * @param size the board size
     */
    private Board(int size) {
        owners = List.of( //
                new Pawn(Color.RED),   // Edge.LEFT
                new Pawn(Color.RED),   // Edge.RIGHT
                new Pawn(Color.BLUE),  // Edge.TOP
                new Pawn(Color.BLUE)   // Edge.BOTTOM
        );

        cells = Stream.generate( //
                        () -> Stream.generate(() -> emptyCell).limit(size).collect(Collectors.toList())) //
                .limit(size).collect(Collectors.toList());
    }

    /**
     * Place a new pawn on the board, as part of the initial board setup
     *
     * @param i     row
     * @param j     column
     * @param color pawn color
     * @throws IllegalStateException if the cell is already taken
     */
    private void set(int i, int j, Color color) {
        if (color != Color.NONE) {
            List<Pawn> row = cells.get(i);
            if (row.get(j).getColor() != Color.NONE) {
                throw new IllegalStateException(String.format("Cell (%d, %d) already taken", i, j));
            }

            Pawn cur = new Pawn(color);
            row.set(j, cur);

            if (i == 0) {
                union(cur, Edge.TOP);
            } else {
                union(cur, i - 1, j);
                if (j < cells.size() - 1) {
                    union(cur, i - 1, j + 1);
                }
            }
            if (j == 0) {
                union(cur, Edge.LEFT);
            } else {
                union(cur, i, j - 1);
            }

            if (i == cells.size() - 1) {
                union(cur, Edge.BOTTOM);
            }
            if (j == cells.size() - 1) {
                union(cur, Edge.RIGHT);
            }
        }
    }

    /**
     * Connect a cell to an edge, when required
     *
     * @param pawn the pawn in the current cell
     * @param edge an edge
     */
    public void union(Pawn pawn, Edge edge) {
        union(pawn, owners.get(edge.ordinal()));
    }

    /**
     * Connect a cell to the cell in a given position, when required
     *
     * @param pawn the pawn in the current cell
     * @param i    other cell row
     * @param j    other cell column
     */
    public void union(Pawn pawn, int i, int j) {
        union(pawn, cells.get(i).get(j));
    }

    /**
     * If the pawns have the same color, should be in the same group.
     * Find the leaders, if different, unify the two groups.
     *
     * @param pawn  a pawn
     * @param other another pawn
     */
    private void union(Pawn pawn, Pawn other) {
        if (pawn.getColor() != other.getColor()) {
            return;
        }

        pawn = find(pawn);
        other = find(other);
        if (pawn == other) {
            return;
        }

        if (other.getGroupSize() < pawn.getGroupSize()) {
            other.setParent(pawn);
            pawn.addGroupSize(other.getGroupSize());
        } else {
            pawn.setParent(other);
            other.addGroupSize(pawn.getGroupSize());
        }
    }

    /**
     * Find the pawn group leader. In the process, short the path to it.
     *
     * @param pawn a pawn
     * @return the pawn group leader
     */
    private Pawn find(Pawn pawn) {
        while (pawn != pawn.getParent()) {
            pawn.setParent(pawn.getParent());
            pawn = pawn.getParent();
        }
        return pawn;
    }

    /**
     * Getter
     *
     * @return the board size
     */
    public int size() {
        return cells.size();
    }

    public Color check(int i, int j) {
        return cells.get(i).get(j).getColor();
    }

    public Color winner() {
        if (owners.get(0).getParent() == owners.get(1).getParent()) {
            return Color.RED;
        }
        if (owners.get(2).getParent() == owners.get(3).getParent()) {
            return Color.BLUE;
        }

        return Color.NONE;
    }

    /**
     * RED goes LEFT to RIGHT - BLUE TOP to BOTTOM
     */
    public enum Edge {
        LEFT, RIGHT, TOP, BOTTOM
    }

    /**
     * Builder for Hex Board
     */
    public static class BoardBuilder {
        /**
         * Board size
         */
        private final int size;
        private final Board board;
        /**
         * Current row to build
         */
        private int i;
        /**
         * Current column to build
         */
        private int j;

        /**
         * No-arg constructor - for the default size board
         */
        public BoardBuilder() {
            this(DEFAULT_SIZE);
        }

        /**
         * Legacy constructor - similar to the Exercism Connect problem setup
         *
         * @param rows a matrix where each character is a pawn
         */
        public BoardBuilder(String[] rows) {
            this(rows.length);
            for (String row : rows) {
                add(row);
            }
        }

        /**
         * Constructor
         *
         * @param size board size
         */
        public BoardBuilder(int size) {
            this.size = size;
            this.i = 0;
            this.j = 0;
            this.board = new Board(size);
        }

        /**
         * Place the passed pawns on the current row
         *
         * @param row the pawn in the current row, as char in a string
         * @return this board builder
         */
        public BoardBuilder add(String row) {
            if (row.length() != size || i >= size) {
                throw new IllegalArgumentException("Bad input: " + row);
            }

            for (char c : row.toCharArray()) {
                board.set(i, j, Color.from(c));
                j += 1;
            }

            i += 1;
            j = 0;

            return this;
        }

        /**
         * Terminal operation
         *
         * @return the generated board
         */
        public Board toBoard() {
            return board;
        }
    }
}
