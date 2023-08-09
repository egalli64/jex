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

class ArrayCount9Test {
    public static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 9 }, 1), //
                Arguments.of(new int[] { 1, 9, 9 }, 2), //
                Arguments.of(new int[] { 1, 9, 9, 3, 9 }, 3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void solutionExamples(int[] input, int expected) {
        assertThat(ArrayCount9.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void modernExamples(int[] input, int expected) {
        assertThat(ArrayCount9.modern(input)).isEqualTo(expected);
    }
}
