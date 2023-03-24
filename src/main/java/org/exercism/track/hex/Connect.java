/*
    Exercism Java track

    Source: exercism.org/tracks/java/exercises/connect
    My solutions: https://github.com/egalli64/jex

    Connect: Compute the result for a game of Hex / Polygon.
 */
package org.exercism.track.hex;

import java.util.List;

class Connect {
    private final Board board;

    /**
     * Constructor
     * <p>
     * No validation - expect the input being in the right format (see unit test for example)
     *
     * @param input an array of strings, representing the current board
     */
    public Connect(String[] input) {
        board = new Board();

        for (int i = 0; i < input.length; i++) {
            List<Pawn> row = board.addRow();

            String[] data = input[i].trim().split(" ");
            for (int j = 0; j < data.length; j++) {
                Pawn pawn = new Pawn(Winner.from(data[j]));
                row.add(pawn);
                if (pawn.getColor() == Winner.NONE) {
                    continue;
                }

                if (i == 0) {
                    board.union(pawn, Board.Edge.TOP);
                } else {
                    board.union(pawn, i - 1, j);
                    if (j < data.length - 1) {
                        board.union(pawn, i - 1, j + 1);
                    }
                }
                if (j == 0) {
                    board.union(pawn, Board.Edge.LEFT);
                } else {
                    board.union(pawn, i, j - 1);
                }

                if (i == input.length - 1) {
                    board.union(pawn, Board.Edge.BOTTOM);
                }
                if (j == data.length - 1) {
                    board.union(pawn, Board.Edge.RIGHT);
                }
            }
        }
    }

    /**
     * The winner (if any)
     *
     * @return the winner, or NONE
     */
    public Winner computeWinner() {
        return board.winner();
    }
}