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

class Has77Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 7, 7 }, true), //
                Arguments.of(new int[] { 1, 7, 1, 7 }, true), //
                Arguments.of(new int[] { 1, 7, 1, 1, 7 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, boolean expected) {
        assertThat(Has77.solution(data)).isEqualTo(expected);
    }

    static Stream<Arguments> basicProvider() {
        return Stream.of( //
                Arguments.of(new int[] { 7 }, false), //
                Arguments.of(new int[] { 7, 7 }, true), //
                Arguments.of(new int[] { 7, 1 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("basicProvider")
    void solutionBasic(int[] data, boolean expected) {
        assertThat(Has77.solution(data)).isEqualTo(expected);
    }
}
