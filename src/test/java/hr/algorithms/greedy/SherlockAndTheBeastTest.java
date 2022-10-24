package hr.algorithms.greedy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SherlockAndTheBeastTest {
    @ParameterizedTest
    @CsvSource({"1,-1", "3,555", "5,33333", "11,55555533333"})
    void decentNumberSamples(int input, String expected) {
        String actual = SherlockAndTheBeast.decentNumber(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}