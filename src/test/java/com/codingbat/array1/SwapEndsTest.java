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

class SwapEndsTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3, 4 }, new int[] { 4, 2, 3, 1 }), //
                Arguments.of(new int[] { 1, 2, 3 }, new int[] { 3, 2, 1 }), //
                Arguments.of(new int[] { 8, 6, 7, 9, 5 }, new int[] { 5, 6, 7, 9, 8 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, int[] expected) {
        assertThat(SwapEnds.solution(input)).isEqualTo(expected);
    }
}
