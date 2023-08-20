package com.codingbat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class String2Test {
    @ParameterizedTest
    @CsvSource({ "abcXY123XYijk,XY,c13i", "XY123XY,XY,13", "XY1XY,XY,11" })
    void wordEndsExamples(String s, String w, String expected) {
        assertThat(String2.wordEnds(s, w)).isEqualTo(expected);
    }
}