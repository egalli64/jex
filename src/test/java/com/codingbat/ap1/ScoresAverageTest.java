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

class ScoresAverageTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 2, 4, 4 }, 4), //
                Arguments.of(new int[] { 4, 4, 4, 2, 2, 2 }, 4), //
                Arguments.of(new int[] { 3, 4, 5, 1, 2, 3 }, 4) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, int expected) {
        assertThat(ScoresAverage.solution(data)).isEqualTo(expected);
    }
}
