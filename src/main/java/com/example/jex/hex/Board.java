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

    Board() {
        owners = List.of( //
                new Pawn(Pawn.Color.RED),   // Edge.LEFT
                new Pawn(Pawn.Color.RED),   // Edge.RIGHT
                new Pawn(Pawn.Color.BLUE),  // Edge.TOP
                new Pawn(Pawn.Color.BLUE),  // Edge.BOTTOM
                new Pawn(Pawn.Color.NONE)   // not assigned
        );

        cells = new ArrayList<>();
    }

    public int size() {
        return cells.size();
    }

    /**
     * RED goes LEFT to RIGHT - BLUE TOP to BOTTOM
     */
    public enum Edge {
        LEFT, RIGHT, TOP, BOTTOM
    }
}
