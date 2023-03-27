/*
    Hex - Logic for a Hex game
    https://en.wikipedia.org/wiki/Hex_(board_game)

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.hex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

class BoardTest {
    @Test
    void buildEmpty() {
        Board board = new Board.BoardBuilder(0).toBoard();
        assertThat(board.size()).isZero();
    }

    @Test
    void buildUncompleted() {
        assertThatIllegalStateException().isThrownBy(() -> new Board.BoardBuilder().toBoard());
    }

    @Test
    void buildSingle() {
        Board board = new Board.BoardBuilder(1).add("B").toBoard();
        assertThat(board.size()).isOne();
        assertThat(board.check(0, 0)).isEqualTo(Color.BLUE);
    }
}
