/*
  CodingBat Array 3 - https://codingbat.com/java/Array-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.array3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Fix45Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 5, 4, 9, 4, 9, 5 }, new int[] { 9, 4, 5, 4, 5, 9 }), //
                Arguments.of(new int[] { 1, 4, 1, 5 }, new int[] { 1, 4, 5, 1 }), //
                Arguments.of(new int[] { 1, 4, 1, 5, 5, 4, 1 }, new int[] { 1, 4, 5, 1, 1, 4, 5 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, int[] expected) {
        assertThat(Fix45.solution(input)).isEqualTo(expected);
    }

    @Test
    void fix45FiveOverlap() {
        int[] input = { 5, 4, 5, 4, 1 };
        int[] expected = { 1, 4, 5, 4, 5 };
        assertThat(Fix45.solution(input)).isEqualTo(expected);
    }
}
