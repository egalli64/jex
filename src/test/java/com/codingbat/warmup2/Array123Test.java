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

class Array123Test {
    public static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 1, 2, 3, 1 }, true), //
                Arguments.of(new int[] { 1, 1, 2, 4, 1 }, false), //
                Arguments.of(new int[] { 1, 1, 2, 1, 2, 3 }, true) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void solutionExamples(int[] input, boolean expected) {
        assertThat(Array123.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void alternativeExamples(int[] input, boolean expected) {
        assertThat(Array123.alternative(input)).isEqualTo(expected);
    }
}
