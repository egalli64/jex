package hr.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringConstructionTest {
    @ParameterizedTest
    @CsvSource({"abcd,4", "abab,2"})
    void stringConstructionSamples(String input, int expected) {
        int actual = StringConstruction.stringConstruction(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}