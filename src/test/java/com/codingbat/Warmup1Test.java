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
    @CsvSource({ "hi there,true", "hi,true", "hello hi,false" })
    void startHiExamples(String input, boolean expected) {
        assertThat(Warmup1.startHi(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "13,20,10,true", "20,19,10,true", "20,10,13,true" })
    void hasTeenExamples(int first, int second, int third, boolean expected) {
        assertThat(Warmup1.hasTeen(first, second, third)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "mix snacks,true", "pix snacks,true", "piz snacks,false" })
    void mixStartExamples(String input, boolean expected) {
        assertThat(Warmup1.mixStart(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "8,13,8", "13,8,8", "13,7,0" })
    void close10Examples(int first, int second, int expected) {
        assertThat(Warmup1.close10(first, second)).isEqualTo(expected);
    }

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
    @CsvSource({ "kitten,kikittenki", "Ha,HaHaHa", "abc,ababcab" })
    void front22Examples(String input, String expected) {
        assertThat(Warmup1.front22(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "120, -1, true", "-1, 120, true", "2, 120, false" })
    void icyHotExamples(int first, int second, boolean expected) {
        assertThat(Warmup1.icyHot(first, second)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "12, 99, true", "21, 12, true", "8, 99, false" })
    void in1020Examples(int first, int second, boolean expected) {
        assertThat(Warmup1.in1020(first, second)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "13, 99, true", "21, 19, true", "13, 13, false" })
    void loneTeenExamples(int first, int second, boolean expected) {
        assertThat(Warmup1.loneTeen(first, second)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "adelbc,abc", "adelHello,aHello", "adedbc,adedbc" })
    void delDelExamples(String input, String expected) {
        assertThat(Warmup1.delDel(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "ozymandias,oz", "bzoo,z", "oxx,o" })
    void startOzExamples(String input, String expected) {
        assertThat(Warmup1.startOz(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 3, 3", "1, 3, 2, 3", "3, 2, 1, 3" })
    void intMaxExamples(int a, int b, int c, int expected) {
        assertThat(Warmup1.intMax(a, b, c)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "30, 31, true", "30, 41, false", "40, 50, true" })
    void in3050Examples(int a, int b, boolean expected) {
        assertThat(Warmup1.in3050(a, b)).isEqualTo(expected);
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