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

class ArrayFront9Test {
    public static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 9, 3, 4 }, true), //
                Arguments.of(new int[] { 1, 2, 3, 4, 9 }, false), //
                Arguments.of(new int[] { 1, 2, 3, 4, 5 }, false), //
                Arguments.of(new int[] {}, false), // empty
                Arguments.of(new int[] { 9 }, true), // single element positive
                Arguments.of(new int[] { 42 }, false) // single element negative
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void examples(int[] input, boolean expected) {
        assertThat(ArrayFront9.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void examplesStream(int[] input, boolean expected) {
        assertThat(ArrayFront9.streamedSolution(input)).isEqualTo(expected);
    }
}
