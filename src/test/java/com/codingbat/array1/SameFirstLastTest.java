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

class SameFirstLastTest {
    public static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3 }, false), //
                Arguments.of(new int[] { 1, 2, 3, 1 }, true), //
                Arguments.of(new int[] { 1, 2, 1 }, true) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void solutionExamples(int[] input, boolean expected) {
        assertThat(SameFirstLast.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void verboseExamples(int[] input, boolean expected) {
        assertThat(SameFirstLast.verbose(input)).isEqualTo(expected);
    }
}
