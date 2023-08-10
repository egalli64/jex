/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Array667Test {
    public static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 6, 6, 2 }, 1), //
                Arguments.of(new int[] { 6, 6, 2, 6 }, 1), //
                Arguments.of(new int[] { 6, 7, 2, 6 }, 1) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void solutionExamples(int[] input, int expected) {
        assertThat(Array667.solution(input)).isEqualTo(expected);
    }
}
