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

class MiddleWayTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }, new int[] { 2, 5 }), //
                Arguments.of(new int[] { 7, 7, 7 }, new int[] { 3, 8, 0 }, new int[] { 7, 8 }), //
                Arguments.of(new int[] { 5, 2, 9 }, new int[] { 1, 4, 5 }, new int[] { 2, 4 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] left, int[] right, int[] expected) {
        assertThat(MiddleWay.solution(left, right)).isEqualTo(expected);
    }
}
