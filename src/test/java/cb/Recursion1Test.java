package cb;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Recursion1Test {
    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "3,6"})
    void factorialExamples(int input, int expected) {
        assertThat(Recursion1.factorial(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "1,2", "2,5"})
    void bunnyEars2Examples(int input, int expected) {
        assertThat(Recursion1.bunnyEars2(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"717,2", "7,1", "123,0"})
    void count7Examples(int input, int expected) {
        assertThat(Recursion1.count7(input)).isEqualTo(expected);
    }

}