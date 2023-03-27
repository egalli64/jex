/*
    Hex - Logic for a Hex game
    https://en.wikipedia.org/wiki/Hex_(board_game)

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.hex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Legacy test based on exercism.org/tracks/java/exercises/connect
 * <p>
 * Major changes:
 * <li>Board is a rhombus, row == col</li>
 * <li>Colors are BLUE and RED</li>
 * <li>Input strings have only relevant characters, 'R', 'B', '.' (or whatever)</li>
 */
class LegacyTest {
    @Test
    void empty() {
        Board board = new Board.BoardBuilder(0).toBoard();
        assertThat(board.winner()).isEqualTo(Color.NONE);
    }

    @Test
    void computeWinnerFiveEmpty() {
        var input = new String[]{".....", ".....", ".....", ".....", "....."};

        Board board = new Board.BoardBuilder(input).toBoard();
        assertThat(board.winner()).isEqualTo(Color.NONE);
    }

    @Test
    void computeWinnerSingleBlue() {
        var input = new String[]{"B"};

        Board board = new Board.BoardBuilder(input).toBoard();
        assertThat(board.winner()).isEqualTo(Color.BLUE);
    }

    @Test
    void computeWinnerSingleRed() {
        var input = new String[]{"R"};

        Board board = new Board.BoardBuilder(input).toBoard();
        assertThat(board.winner()).isEqualTo(Color.RED);
    }

    @Test
    void computeWinnerFourEdgesOnly() {
        var input = new String[]{"RRRB", "B..B", "B..B", "BRRR"};

        Board board = new Board.BoardBuilder(input).toBoard();
        assertThat(board.winner()).isEqualTo(Color.NONE);
    }

    @Test
    void computeWinnerFiveIllegalDiagonal() {
        var input = new String[]{"RB..R", "BRRRR", "BRB.R", ".BR.B", "RRBBB"};

        Board board = new Board.BoardBuilder(input).toBoard();
        assertThat(board.winner()).isEqualTo(Color.NONE);
    }

    @Test
    void computeWinnerFourCrossingRed() {
        var input = new String[]{".B..", "BRRR", "BRB.", "RRBR"};

        Board board = new Board.BoardBuilder(input).toBoard();
        assertThat(board.winner()).isEqualTo(Color.RED);
    }
}