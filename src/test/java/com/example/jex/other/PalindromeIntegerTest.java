package com.example.jex.other;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PalindromeIntegerTest {
    @ParameterizedTest
    @CsvSource({"0,0", "7,1", "19,2", "100,3"})
    void decimalDigits(int input, int expected) {
        int actual = PalindromeInteger.decimalDigits(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "7,7", "19,1", "301,3"})
    void leftmostDecimalDigits(int input, int expected) {
        int actual = PalindromeInteger.leftmostDecimalDigits(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "7,7", "19,9", "301,1"})
    void rightmostDecimalDigits(int input, int expected) {
        int actual = PalindromeInteger.rightmostDecimalDigits(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"0,true", "7,true", "19,false", "22,true", "301,false", "303,true", "1301,false", "1331,true"})
    void isDecimalPalindrome(int input, boolean expected) {
        boolean actual = PalindromeInteger.isDecimalPalindrome(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"2_123_443_212,true", "2_123_563_212,false"})
    void isDecimalPalindromeLarge(int input, boolean expected) {
        boolean actual = PalindromeInteger.isDecimalPalindrome(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"2_123_43_212,true"})
    void isDecimalPalindromeLarge2(int input, boolean expected) {
        boolean actual = PalindromeInteger.isDecimalPalindrome(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}