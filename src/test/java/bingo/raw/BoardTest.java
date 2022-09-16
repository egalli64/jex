package bingo.raw;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BoardTest {
    @Test
    void extractSingle() {
        Board board = new Board(1);
        int actual = board.extract();
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    void extractSingleOutOfBound() {
        Board board = new Board(1);
        board.extract();
        try {
            board.extract();
            Assertions.fail("An ArrayIndexOutOfBoundsException was expected!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            // as expected
        }
    }

    @Test
    void extract90() {
        Board board = new Board(90);
        int actual = 0;
        for (int i = 0; i < 90; i++) {
            actual += board.extract();
        }
        Assertions.assertThat(actual).isEqualTo(91 * 45);
    }
}