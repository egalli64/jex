/*
    Hex - Logic for a Hex game
    https://en.wikipedia.org/wiki/Hex_(board_game)

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.hex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoardTest {
    @Test
    void buildEmpty() {
        Board board = new Board.BoardBuilder(0).toBoard();
        assertThat(board.size()).isZero();
    }

    @Test
    void buildDefaultSizeEmpty() {
        Board board = new Board.BoardBuilder().toBoard();
        assertThat(board.size()).isEqualTo(Board.DEFAULT_SIZE);
    }

    @Test
    void buildSingleBlue() {
        Board board = new Board.BoardBuilder(1).add("B").toBoard();
        assertThat(board.size()).isOne();
        assertThat(board.check(0, 0)).isEqualTo(Color.BLUE);
    }
}
