/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SumHeightsTest {
    static Stream<Arguments> provider() {
        int[] heights = { 5, 3, 6, 7, 2 };
        return Stream.of( //
                Arguments.of(heights, 2, 4, 6), //
                Arguments.of(heights, 0, 1, 2), //
                Arguments.of(heights, 0, 4, 11) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] heights, int start, int end, int expected) {
        assertThat(SumHeights.solution(heights, start, end)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void modernExamples(int[] heights, int start, int end, int expected) {
        assertThat(SumHeights.modern(heights, start, end)).isEqualTo(expected);
    }
}
