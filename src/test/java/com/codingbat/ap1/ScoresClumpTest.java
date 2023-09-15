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

class ScoresClumpTest {

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 3, 4, 5 }, true), //
                Arguments.of(new int[] { 3, 4, 6 }, false), //
                Arguments.of(new int[] { 1, 3, 5, 5 }, true) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, boolean expected) {
        assertThat(ScoresClump.solution(data)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void alternativeExamples(int[] data, boolean expected) {
        assertThat(ScoresClump.alternative(data)).isEqualTo(expected);
    }
}
