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

class MaxEnd3Test {
    public static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3 }, new int[] { 3, 3, 3 }), //
                Arguments.of(new int[] { 11, 5, 9 }, new int[] { 11, 11, 11 }), //
                Arguments.of(new int[] { 2, 11, 3 }, new int[] { 3, 3, 3 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    public void solutionExamples(int[] input, int[] expected) {
        assertThat(MaxEnd3.solution(input)).isEqualTo(expected);
    }
}
