/*
    Hex - Logic for a Hex game
    https://en.wikipedia.org/wiki/Hex_(board_game)

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.hex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BoardTest {
    @Test
    void buildNull() {
        assertThatNullPointerException().isThrownBy(() -> Board.create(null));
    }

    @Test
    void buildEmpty() {
        Board board = Board.create(new String[]{});
        assertThat(board.size()).isZero();
        assertThat(board.winner()).isEqualTo(Color.NONE);
    }

    @Test
    void buildSingleBlue() {
        Board board = Board.create(new String[]{"B"});
        assertThat(board.size()).isOne();
        assertThat(board.check(0, 0)).isEqualTo(Color.BLUE);
        assertThat(board.winner()).isEqualTo(Color.BLUE);
    }

    @Test
    void buildSingleRowWrong() {
        assertThatIllegalArgumentException().isThrownBy(() -> Board.create(new String[]{"BB"}));
    }

    @Test
    void buildSingleColWrong() {
        assertThatIllegalArgumentException().isThrownBy(() -> Board.create(new String[]{"R", "B"}));
    }

    @Test
    void winnerBlueTwoAlternate() {
        Board board = Board.create(new String[]{"RB", "BR"});
        assertThat(board.winner()).isEqualTo(Color.BLUE);
    }

    @Test
    void winnerNoneThree() {
        Board board = Board.create(new String[]{"RBR", "B.B", "RBR"});
        assertThat(board.winner()).isEqualTo(Color.NONE);
    }
}
