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

class ScoresSpecialTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 12, 10, 4 }, new int[] { 2, 20, 30 }, 40), //
                Arguments.of(new int[] { 20, 10, 4 }, new int[] { 2, 20, 10 }, 40), //
                Arguments.of(new int[] { 12, 11, 4 }, new int[] { 2, 20, 31 }, 20) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] left, int[] right, int expected) {
        assertThat(ScoresSpecial.solution(left, right)).isEqualTo(expected);
    }

    static Stream<Arguments> singleProvider() {
        return Stream.of( //
                Arguments.of(new int[] { 12, 10, 4 }, 10), //
                Arguments.of(new int[] { 20, 10, 4 }, 20), //
                Arguments.of(new int[] { 12, 11, 4 }, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("singleProvider")
    void solutionExamples(int[] values, int expected) {
        assertThat(ScoresSpecial.solution(values)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("singleProvider")
    void modernExamples(int[] values, int expected) {
        assertThat(ScoresSpecial.modern(values)).isEqualTo(expected);
    }
}
