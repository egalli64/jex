/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CopyEvensTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 3, 2, 4, 5, 8 }, 2, new int[] { 2, 4 }), //
                Arguments.of(new int[] { 3, 2, 4, 5, 8 }, 3, new int[] { 2, 4, 8 }), //
                Arguments.of(new int[] { 6, 1, 2, 4, 5, 8 }, 3, new int[] { 6, 2, 4 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, int n, int[] expected) {
        assertThat(CopyEvens.solution(input, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void modernExamples(int[] input, int n, int[] expected) {
        assertThat(CopyEvens.modern(input, n)).isEqualTo(expected);
    }
}
