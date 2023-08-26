package com.codingbat.ap1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SumHeights2Test {
    static Stream<Arguments> provider() {
        int[] heights = { 5, 3, 6, 7, 2 };
        return Stream.of( //
                Arguments.of(heights, 2, 4, 7), //
                Arguments.of(heights, 0, 1, 2), //
                Arguments.of(heights, 0, 4, 15) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] heights, int start, int end, int expected) {
        assertThat(SumHeights2.solution(heights, start, end)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void unsupportedExamples(int[] heights, int start, int end, int expected) {
        assertThat(SumHeights2.unsupported(heights, start, end)).isEqualTo(expected);
    }
}
