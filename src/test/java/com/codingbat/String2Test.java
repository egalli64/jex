package com.codingbat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class String2Test {
    @ParameterizedTest
    @CsvSource({ "zipXzap,zpXzp", "zopzop,zpzp", "zzzopzop,zzzpzp" })
    void zipZapExamples(String s, String expected) {
        assertThat(String2.zipZap(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "ab*cd,ad", "ab**cd,ad", "sm*eilly,silly" })
    void starOutExamples(String s, String expected) {
        assertThat(String2.starOut(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "12xy34,xy,++xy++", "12xy34,1,1+++++", "12xy34xyabcxy,xy,++xy++xy+++xy" })
    void plusOutExamples(String s, String w, String expected) {
        assertThat(String2.plusOut(s, w)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abcXY123XYijk,XY,c13i", "XY123XY,XY,13", "XY1XY,XY,11" })
    void wordEndsExamples(String s, String w, String expected) {
        assertThat(String2.wordEnds(s, w)).isEqualTo(expected);
    }
}