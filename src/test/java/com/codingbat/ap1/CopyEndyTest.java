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

class CopyEndyTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 9, 11, 90, 22, 6 }, 2, new int[] { 9, 90 }), //
                Arguments.of(new int[] { 9, 11, 90, 22, 6 }, 3, new int[] { 9, 90, 6 }), //
                Arguments.of(new int[] { 12, 1, 1, 13, 0, 20 }, 2, new int[] { 1, 1 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, int n, int[] expected) {
        assertThat(CopyEndy.solution(input, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void modernExamples(int[] input, int n, int[] expected) {
        assertThat(CopyEndy.modern(input, n)).isEqualTo(expected);
    }
}
