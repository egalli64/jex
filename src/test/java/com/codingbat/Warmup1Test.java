/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Warmup1Test {
    @ParameterizedTest
    @CsvSource({ "Hello,true", "Heelle,true", "Heelele,false" })
    void stringEExamples(String input, boolean expected) {
        assertThat(Warmup1.stringE(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Miracle,2,Mrce", "abcdefg,2,aceg", "abcdefg,3,adg" })
    void everyNthExamples(String s, int n, String expected) {
        assertThat(Warmup1.everyNth(s, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, -1, false, true", "-1, 1, false, true", "-4, -5, true, true" })
    void posNegExExamples(int first, int second, boolean flag, boolean expected) {
        assertThat(Warmup1.posNegEx(first, second, flag)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "11, 19, 19", "19, 11, 19", "11, 9, 11" })
    void max1020Examples(int a, int b, int expected) {
        assertThat(Warmup1.max1020(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "7, 17, true", "6, 17, false", "3, 113, true" })
    void lastDigitExamples(int a, int b, boolean expected) {
        assertThat(Warmup1.lastDigit(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,HeLLO", "hi there,hi thERE", "hi,HI" })
    void endUpExamples(String input, String expected) {
        assertThat(Warmup1.endUp(input)).isEqualTo(expected);
    }
}