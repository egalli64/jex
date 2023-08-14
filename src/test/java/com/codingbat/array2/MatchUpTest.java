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

class MatchUpTest {
    static Stream<Arguments> provider() {
        int[] left = { 1, 2, 3 };
        return Stream.of( //
                Arguments.of(left, new int[] { 2, 3, 10 }, 2), //
                Arguments.of(left, new int[] { 2, 3, 5 }, 3), //
                Arguments.of(left, new int[] { 2, 3, 3 }, 2) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] left, int[] right, int expected) {
        assertThat(MatchUp.solution(left, right)).isEqualTo(expected);
    }
}
