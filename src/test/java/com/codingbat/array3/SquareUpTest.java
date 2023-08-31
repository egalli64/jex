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

class SquareUpTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(3, new int[] { 0, 0, 1, 0, 2, 1, 3, 2, 1 }), //
                Arguments.of(2, new int[] { 0, 1, 2, 1 }), //
                Arguments.of(4, new int[] { 0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int input, int[] expected) {
        assertThat(SquareUp.solution(input)).isEqualTo(expected);
    }
}
