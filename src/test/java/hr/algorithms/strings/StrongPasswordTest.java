package hr.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StrongPasswordTest {
    @ParameterizedTest
    @CsvSource({"2bbbb,2", "2bb#A,1"})
    void minimumNumberExamples(String input, int expected) {
        int actual = StrongPassword.minimumNumber(input.length(), input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}