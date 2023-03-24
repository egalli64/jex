/*
    Exercism Java track

    Source: exercism.org/tracks/java/exercises/connect
    My solutions: https://github.com/egalli64/jex

    Connect: Compute the result for a game of Hex / Polygon.
 */
package org.exercism.track.hex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConnectTest {
    @Test
    void empty() {
        Connect connect = new Connect(new String[] {});
        assertThat(connect.computeWinner()).isEqualTo(Winner.NONE);
    }

    @Test
    void computeWinnerFiveByFiveEmpty() {
        var board = new String[]{ //
                ". . . . .", " . . . . .", "  . . . . .", "   . . . . .", "    . . . . ." //
        };

        Connect connect = new Connect(board);
        assertThat(connect.computeWinner()).isEqualTo(Winner.NONE);
    }

    @Test
    void computeWinnerSingleX() {
        var board = new String[]{"X"};
        Connect connect = new Connect(board);
        assertThat(connect.computeWinner()).isEqualTo(Winner.PLAYER_X);
    }

    @Test
    void computeWinnerSingleO() {
        var board = new String[]{"O"};
        Connect connect = new Connect(board);
        assertThat(connect.computeWinner()).isEqualTo(Winner.PLAYER_O);
    }

    @Test
    void computeWinnerFourByFourEdgesOnly() {
        var board = new String[]{ //
                "O O O X", " X . . X", "  X . . X", "   X O O O" //
        };

        Connect connect = new Connect(board);
        assertThat(connect.computeWinner()).isEqualTo(Winner.NONE);
    }

    @Test
    void computeWinnerFourByFiveIllegalDiagonal() {
        var board = new String[]{ //
                "X O . .", " O X X X", "  O X O .", "   . O X .", "    X X O O" //
        };

        Connect connect = new Connect(board);
        assertThat(connect.computeWinner()).isEqualTo(Winner.NONE);
    }

    @Test
    void computeWinnerFourByFiveCrossingX() {
        var board = new String[]{ //
                ". O . .", " O X X X", "  O X O .", "   X X O X", "    . O X ." //
        };

        Connect connect = new Connect(board);
        assertThat(connect.computeWinner()).isEqualTo(Winner.PLAYER_X);
    }
}