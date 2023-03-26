package com.example.jex.hex;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BoardBuilderTest {
    @Test
    void empty() {
        Board board = new BoardBuilder(0).toBoard();
        Assertions.assertThat(board.size()).isZero();
    }

    @Test
    void uncompleted() {
        Assertions.assertThatIllegalStateException().isThrownBy(() -> new BoardBuilder().toBoard());
    }
}