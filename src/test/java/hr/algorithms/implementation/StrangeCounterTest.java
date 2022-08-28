package hr.algorithms.implementation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StrangeCounterTest {
    @ParameterizedTest
    @CsvSource({"1,3", "4,6", "10, 12"})
    void strangeCounterBeginSub(long input, long expected) {
        long actual = StrangeCounter.strangeCounter(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"3,1", "9,1", "21, 1"})
    void strangeCounterEndSub(long input, long expected) {
        long actual = StrangeCounter.strangeCounter(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}