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

class RotateLeft3Test {
    public static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3 }, new int[] { 2, 3, 1 }), //
                Arguments.of(new int[] { 5, 11, 9 }, new int[] { 11, 9, 5 }), //
                Arguments.of(new int[] { 7, 0, 0 }, new int[] { 0, 0, 7 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void solutionExamples(int[] input, int[] expected) {
        assertThat(RotateLeft3.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void robustnessExamples(int[] input, int[] expected) {
        assertThat(RotateLeft3.robustness(input)).isEqualTo(expected);
    }
}
