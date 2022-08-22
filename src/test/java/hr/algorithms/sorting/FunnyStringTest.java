package hr.algorithms.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FunnyStringTest {
    @ParameterizedTest
    @CsvSource({"acxz,Funny", "bcxz,Not Funny"})
    void funnyStringSamples(String input, String expected) {
        String actual = FunnyString.funnyString(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}