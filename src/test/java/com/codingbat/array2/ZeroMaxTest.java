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

class ZeroMaxTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 0, 5, 0, 3 }, new int[] { 5, 5, 3, 3 }), //
                Arguments.of(new int[] { 0, 4, 0, 3 }, new int[] { 3, 4, 3, 3 }), //
                Arguments.of(new int[] { 0, 1, 0 }, new int[] { 1, 1, 0 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, int[] expected) {
        assertThat(ZeroMax.solution(data)).isEqualTo(expected);
    }
}
