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

class BigDiffTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 10, 3, 5, 6 }, 7), //
                Arguments.of(new int[] { 7, 2, 10, 9 }, 8), //
                Arguments.of(new int[] { 2, 10, 7, 2 }, 8) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, int expected) {
        assertThat(BigDiff.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void alternativeExamples(int[] input, int expected) {
        assertThat(BigDiff.alternative(input)).isEqualTo(expected);
    }
}
