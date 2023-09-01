/*
  CodingBat Array 3 - https://codingbat.com/java/Array-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.array3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CountClumpsTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 2, 3, 4, 4 }, 2), //
                Arguments.of(new int[] { 1, 1, 2, 1, 1 }, 2), //
                Arguments.of(new int[] { 1, 1, 1, 1, 1 }, 1) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, int expected) {
        assertThat(CountClumps.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void alternativeExamples(int[] input, int expected) {
        assertThat(CountClumps.alternative(input)).isEqualTo(expected);
    }
}
