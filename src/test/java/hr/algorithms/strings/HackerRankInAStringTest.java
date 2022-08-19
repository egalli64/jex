package hr.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HackerRankInAStringTest {
    @Test
    void hackerrankInStringSample0() {
        String input = "hereiamstackerrank";
        String expected = "YES";
        String actual = HackerRankInAString.hackerrankInString(input);

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}