/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Sum3Test {
    public static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3 }, 6), //
                Arguments.of(new int[] { 5, 11, 2 }, 18), //
                Arguments.of(new int[] { 7, 0, 0 }, 7) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void solutionExamples(int[] input, int expected) {
        assertThat(Sum3.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void robustnessExamples(int[] input, int expected) {
        assertThat(Sum3.robustness(input)).isEqualTo(expected);
    }
}
