/*
  CodingBat Array 3 - https://codingbat.com/java/Array-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.array3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaxSpanTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] {}, 0), //
                Arguments.of(new int[] { 1 }, 1), //
                Arguments.of(new int[] { 1, 2, 1, 1, 3 }, 4), //
                Arguments.of(new int[] { 1, 4, 2, 1, 4, 1, 4 }, 6), //
                Arguments.of(new int[] { 1, 4, 2, 1, 4, 4, 4 }, 6) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, int expected) {
        assertThat(MaxSpan.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void doubleForExamples(int[] input, int expected) {
        assertThat(MaxSpan.doubleFor(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void linearExamples(int[] input, int expected) {
        assertThat(MaxSpan.linear(input)).isEqualTo(expected);
    }
}
