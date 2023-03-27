/*
    Hex - Logic for a Hex game
    https://en.wikipedia.org/wiki/Hex_(board_game)

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.hex;

import java.util.ArrayList;
import java.util.List;

/**
 * The board, a rhombus scaling rightward where each cell is a hexagon
 */
public class Board {
    /**
     * Extra nodes, to ease the job of checking the winner
     */
    private final List<Pawn> owners;

    private final List<List<Pawn>> cells;

    /**
     * Constructor - used by factory method
     */
    private Board(int size) {
        owners = List.of( //
                new Pawn(Color.RED),   // Edge.LEFT
                new Pawn(Color.RED),   // Edge.RIGHT
                new Pawn(Color.BLUE),  // Edge.TOP
                new Pawn(Color.BLUE)   // Edge.BOTTOM
        );

        cells = new ArrayList<>(size);
    }

    /**
     * Factory method
     *
     * @param lines each line is converted to a row in the board
     * @return the generated board
     * @throws NullPointerException     if lines is null
     * @throws IllegalArgumentException if lines is not a "squared" array of strings
     */
    public static Board create(String[] lines) {
        Board board = new Board(lines.length);
        if (lines.length == 0) {
            return board;
        }

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            if (line.length() != lines.length) {
                throw new IllegalArgumentException(String.format("Row [%s] length is not %d!", line, lines.length));
            }

            List<Pawn> row = new ArrayList<>(lines.length);
            board.cells.add(row);

            for (int j = 0; j < line.length(); j++) {
                Pawn pawn = new Pawn(Color.from(line.charAt(j)));
                row.add(pawn);
                if (pawn.getColor() == Color.NONE) {
                    continue;
                }

                if (i == 0) {
                    board.union(pawn, Edge.TOP);
                } else {
                    board.union(pawn, i - 1, j);
                    if (j < board.cells.size() - 1) {
                        board.union(pawn, i - 1, j + 1);
                    }
                }
                if (j == 0) {
                    board.union(pawn, Edge.LEFT);
                } else {
                    board.union(pawn, i, j - 1);
                }
            }
            board.union(row.get(row.size() - 1), Edge.RIGHT);
        }

        List<Pawn> bottom = board.cells.get(board.size() - 1);
        bottom.forEach(pawn -> board.union(pawn, Edge.BOTTOM));

        return board;
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
}
