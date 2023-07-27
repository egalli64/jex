package com.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class No23Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 4, 5 }, true), //
                Arguments.of(new int[] { 4, 2 }, false), //
                Arguments.of(new int[] { 3, 5 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, boolean expected) {
        assertThat(No23.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void robustnessExamples(int[] input, boolean expected) {
        assertThat(No23.robustness(input)).isEqualTo(expected);
    }
}
