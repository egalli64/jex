/*
    Hex - Logic for a Hex game
    https://en.wikipedia.org/wiki/Hex_(board_game)

    Hosted on https://github.com/egalli64/jex
 */
package com.example.jex.hex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class BoardTest {
    @Test
    void buildEmpty() {
        Board board = new Board.BoardBuilder(0).toBoard();
        assertThat(board.size()).isZero();
        assertThat(board.winner()).isEqualTo(Color.NONE);
    }

    @Test
    void buildDefaultSizeEmpty() {
        Board board = new Board.BoardBuilder().toBoard();
        assertThat(board.size()).isEqualTo(Board.DEFAULT_SIZE);
        assertThat(board.winner()).isEqualTo(Color.NONE);
    }

    @Test
    void buildSingleBlue() {
        Board board = new Board.BoardBuilder(1).add("B").toBoard();
        assertThat(board.size()).isOne();
        assertThat(board.check(0, 0)).isEqualTo(Color.BLUE);
        assertThat(board.winner()).isEqualTo(Color.BLUE);
    }

    @Test
    void buildSingleWrongRow() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Board.BoardBuilder(1).add("BB"));
    }

    @Test
    void buildSingleWrongCol() {
        var bb = new Board.BoardBuilder(1).add("A");
        assertThatIllegalArgumentException().isThrownBy(() -> bb.add("A"));
    }

    @Test
    void winnerBlueTwoAlternate() {
        Board board = new Board.BoardBuilder(2).add("RB").add("BR").toBoard();
        assertThat(board.winner()).isEqualTo(Color.BLUE);
    }

    @Test
    void winnerNoneThree() {
        Board board = new Board.BoardBuilder(3).add("RBR").add("B.B").add("RBR").toBoard();
        assertThat(board.winner()).isEqualTo(Color.NONE);
    }

}
