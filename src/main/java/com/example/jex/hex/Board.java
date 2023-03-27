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
    private final static List<Pawn> owners = List.of( //
            new Pawn(Color.RED),   // Edge.LEFT
            new Pawn(Color.RED),   // Edge.RIGHT
            new Pawn(Color.BLUE),  // Edge.TOP
            new Pawn(Color.BLUE)   // Edge.BOTTOM
    );

    private final List<List<Pawn>> cells;

    /**
     * Private constructor, to be used by BoardBuilder - create an empty board
     *
     * @param size the board size
     */
    private Board(int size) {
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
            row.set(j, new Pawn(color));
        }
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
