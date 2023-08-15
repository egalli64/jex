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

class ShiftLeftTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 6, 2, 5, 3 }, new int[] { 2, 5, 3, 6 }), //
                Arguments.of(new int[] { 1, 2 }, new int[] { 2, 1 }), //
                Arguments.of(new int[] { 1 }, new int[] { 1 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, int[] expected) {
        assertThat(ShiftLeft.solution(data)).isEqualTo(expected);
    }
}
