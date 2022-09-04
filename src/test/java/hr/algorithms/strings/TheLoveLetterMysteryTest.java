package hr.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TheLoveLetterMysteryTest {
    @ParameterizedTest
    @CsvSource({"abc,2", "abcba,0", "abcd,4", "cba,2"})
    void theLoveLetterMysterySample(String input, int expected) {
        int actual = TheLoveLetterMystery.theLoveLetterMystery(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}