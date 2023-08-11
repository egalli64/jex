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

class Lucky13Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 0, 2, 4 }, true), //
                Arguments.of(new int[] { 1, 2, 3 }, false), //
                Arguments.of(new int[] { 1, 2, 4 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, boolean expected) {
        assertThat(Lucky13.solution(input)).isEqualTo(expected);
    }
}
