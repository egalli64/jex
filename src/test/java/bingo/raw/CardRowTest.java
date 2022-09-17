package bingo.raw;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CardRowTest {
    @Test
    void check42() {
        CardRow row = new CardRow(new int[]{82, 13, 42, 5, 18});
        boolean actual = row.check(42);
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void checkMissing() {
        CardRow row = new CardRow(new int[]{82, 13, 42, 5, 18});
        boolean actual = row.check(21);
        Assertions.assertThat(actual).isFalse();
    }

    @Test
    void isWinningPositive() {
        int[] input = {82, 13, 42, 5, 18};
        CardRow row = new CardRow(input);
        for (int current : input) {
            Assertions.assertThat(row.check(current)).isTrue();
        }
        Assertions.assertThat(row.isWinning()).isTrue();
    }
}