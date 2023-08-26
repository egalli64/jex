package com.codingbat.ap1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BigHeightsTest {
    static Stream<Arguments> provider() {
        int[] heights = { 5, 3, 6, 7, 2 };
        return Stream.of( //
                Arguments.of(heights, 2, 4, 1), //
                Arguments.of(heights, 0, 1, 0), //
                Arguments.of(heights, 0, 4, 1) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] heights, int start, int end, int expected) {
        assertThat(BigHeights.solution(heights, start, end)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void unsupportedExamples(int[] heights, int start, int end, int expected) {
        assertThat(BigHeights.unsupported(heights, start, end)).isEqualTo(expected);
    }
}
