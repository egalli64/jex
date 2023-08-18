package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class XyzThereTest {
    @ParameterizedTest
    @CsvSource({ "abcxyz,true", "abc.xyz,false", "xyz.abc,true" })
    void solutionExamples(String input, boolean expected) {
        assertThat(XyzThere.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abcxyz,true", "abc.xyz,false", "xyz.abc,true" })
    void unsupportedExamples(String input, boolean expected) {
        assertThat(XyzThere.unsupported(input)).isEqualTo(expected);
    }
}
