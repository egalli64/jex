package hr.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PalindromeIndexTest {
    @ParameterizedTest
    @CsvSource({"aaab,3", "baa,0", "aaa,-1"})
    void palindromeIndexSamples(String input, int expected) {
        int actual = PalindromeIndex.palindromeIndex(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"a,-1", "ba,0", "aa,-1"})
    void palindromeIndexShorts(String input, int expected) {
        int actual = PalindromeIndex.palindromeIndex(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}