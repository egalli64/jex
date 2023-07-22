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

class MakeEndsTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3 }, new int[] { 1, 3 }), //
                Arguments.of(new int[] { 1, 2, 3, 4 }, new int[] { 1, 4 }), //
                Arguments.of(new int[] { 7, 4, 6, 2 }, new int[] { 7, 2 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, int[] expected) {
        assertThat(MakeEnds.solution(input)).isEqualTo(expected);
    }
}
