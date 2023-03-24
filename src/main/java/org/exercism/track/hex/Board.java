/*
    Exercism Java track

    Source: exercism.org/tracks/java/exercises/connect
    My solutions: https://github.com/egalli64/jex

    Connect: Compute the result for a game of Hex / Polygon.
 */
package org.exercism.track.hex;

import java.util.ArrayList;
import java.util.List;

/**
 * The board, a trapezium scaling rightward where each cell is a hexagon
 */
public class Board {
    /**
     * Extra nodes, to ease the job of checking the winner
     */
    private final List<Pawn> edges;
    private final List<List<Pawn>> cells;

    public Board() {
        edges = List.of( //
                new Pawn(Winner.PLAYER_X),  // Edge.LEFT
                new Pawn(Winner.PLAYER_X),  // Edge.RIGHT
                new Pawn(Winner.PLAYER_O),  // Edge.TOP
                new Pawn(Winner.PLAYER_O)   // Edge.BOTTOM
        );

        cells = new ArrayList<>();
    }

    /**
     * The caller should build the board, filling each row with the actual values
     *
     * @return a new empty raw
     */
    public List<Pawn> addRow() {
        List<Pawn> row = new ArrayList<>();
        cells.add(row);
        return row;
    }

    /**
     * Check left/right and top/bottom edges for a winner
     *
     * @return the winner, or NONE
     */
    public Winner winner() {
        if (edges.get(0).getParent() == edges.get(1).getParent()) {
            return Winner.PLAYER_X;
        }
        if (edges.get(2).getParent() == edges.get(3).getParent()) {
            return Winner.PLAYER_O;
        }
        return Winner.NONE;
    }

    /**
     * Connect a cell to an edge, when required
     *
     * @param pawn the pawn in the current cell
     * @param edge an edge
     */
    public void union(Pawn pawn, Edge edge) {
        union(pawn, edges.get(edge.ordinal()));
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

        if (other.getSize() < pawn.getSize()) {
            other.setParent(pawn);
            pawn.addSize(other.getSize());
        } else {
            pawn.setParent(other);
            other.addSize(other.getSize());
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
     * X goes LEFT to RIGHT - O TOP to BOTTOM
     */
    public enum Edge {
        LEFT, RIGHT, TOP, BOTTOM
    }
}
