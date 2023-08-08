package com.codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Warmup2Test {
    @ParameterizedTest
    @CsvSource({ "axxbb,true", "axaxax,false", "xxxxx,true" })
    void doubleXExamples(String input, boolean expected) {
        assertThat(Warmup2.doubleX(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "hixxhi,1", "xaxxaxaxx,1", "axxxaaxx,2" })
    void last2Examples(String input, int expected) {
        assertThat(Warmup2.last2(input)).isEqualTo(expected);
    }

    @Test
    void array123Example1() {
        int[] input = { 1, 1, 2, 3, 1 };
        assertThat(Warmup2.array123(input)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({ "kitten,kien", "Chocolate,Chole", "CodingHorror,Congrr" })
    void altPairsExamples(String input, String expected) {
        assertThat(Warmup2.altPairs(input)).isEqualTo(expected);
    }

    @Test
    void array123Empty() {
        assertThat(Warmup2.altPairs("")).isEqualTo("");
    }

    @Test
    void noTriplesExample1() {
        int[] input = { 1, 1, 2, 2, 1 };
        assertThat(Warmup2.noTriples(input)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({ "Chocolate,2,ChoCho", "Chocolate,3,ChoChoCho", "Abc,3,AbcAbcAbc" })
    void frontTimes11Examples(String input, int times, String expected) {
        assertThat(Warmup2.frontTimes11(input, times)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Chocolate,2,ChoCho", "Chocolate,3,ChoChoCho", "Abc,3,AbcAbcAbc" })
    void frontTimesExamples(String input, int times, String expected) {
        assertThat(Warmup2.frontTimes(input, times)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,Hlo", "Hi,H", "Heeololeo,Hello" })
    void stringBitsExamples(String input, String expected) {
        assertThat(Warmup2.stringBits(input)).isEqualTo(expected);
    }

    @Test
    void arrayCount9Example1() {
        int[] input = { 1, 2, 9 };
        int expected = 1;
        assertThat(Warmup2.arrayCount9(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "xxcaazz,xxbaaz,3", "abc,abc,2", "abc,axc,0" })
    void stringMatchExamples(String left, String right, int expected) {
        assertThat(Warmup2.stringMatch(left, right)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "yakpak,pak", "pakyak,pak", "yak123ya,123ya" })
    void stringYakExamples(String input, String expected) {
        assertThat(Warmup2.stringYak(input)).isEqualTo(expected);
    }

    @Test
    void has271Example1() {
        int[] input = { 1, 2, 7, 1 };
        assertThat(Warmup2.has271(input)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({ "abcxx,1", "xxx,2", "xxxx,3" })
    void countXXExamples(String input, int expected) {
        assertThat(Warmup2.countXX(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Code,CCoCodCode", "abc,aababc", "ab,aab" })
    void stringSplosionExamples(String input, String expected) {
        assertThat(Warmup2.stringSplosion(input)).isEqualTo(expected);
    }

    @Test
    void arrayFront9Example1() {
        int[] input = { 1, 2, 9, 3, 4 };
        assertThat(Warmup2.arrayFront9(input)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({ "xxHxix,xHix", "abxxxcd,abcd", "xabxxxcdx,xabcdx" })
    void stringXExamples(String input, String expected) {
        assertThat(Warmup2.stringX(input)).isEqualTo(expected);
    }

    @Test
    void array667Example1() {
        int[] input = { 6, 6, 2 };
        int expected = 1;
        assertThat(Warmup2.array667(input)).isEqualTo(expected);
    }
}