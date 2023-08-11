/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Sum67Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 2 }, 5), //
                Arguments.of(new int[] { 1, 2, 2, 6, 99, 99, 7 }, 5), //
                Arguments.of(new int[] { 1, 1, 6, 7, 2 }, 4) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, int expected) {
        assertThat(Sum67.solution(input)).isEqualTo(expected);
    }
}
