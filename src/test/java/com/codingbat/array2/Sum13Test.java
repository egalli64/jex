/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Sum13Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 2, 1 }, 6), //
                Arguments.of(new int[] { 1, 1 }, 2), //
                Arguments.of(new int[] { 1, 2, 2, 1, 13 }, 6) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, int expected) {
        assertThat(Sum13.solution(input)).isEqualTo(expected);
    }

    @Test
    void solutionSkipLast() {
        int[] input = { 1, 2, 2, 1, 13, 42 };
        int expected = 6;
        assertThat(Sum13.solution(input)).isEqualTo(expected);
    }
}
