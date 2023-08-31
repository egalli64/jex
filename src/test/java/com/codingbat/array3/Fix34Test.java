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

class Fix34Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 3, 1, 4 }, new int[] { 1, 3, 4, 1 }), //
                Arguments.of(new int[] { 1, 3, 1, 4, 4, 3, 1 }, new int[] { 1, 3, 4, 1, 1, 3, 4 }), //
                Arguments.of(new int[] { 3, 2, 2, 4 }, new int[] { 3, 4, 2, 2 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, int[] expected) {
        assertThat(Fix34.solution(input)).isEqualTo(expected);
    }

    @Test
    void solutionMixed() {
        int[] input = { 5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5 };
        int[] expected = { 5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4 };
        assertThat(Fix34.solution(input)).isEqualTo(expected);
    }
}
