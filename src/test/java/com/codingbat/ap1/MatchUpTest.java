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

class MatchUpTest {
    static Stream<Arguments> provider() {
        String[] left = { "aa", "bb", "cc" };
        return Stream.of( //
                Arguments.of(left, new String[] { "aaa", "xx", "bb" }, 1), //
                Arguments.of(left, new String[] { "aaa", "b", "bb" }, 2), //
                Arguments.of(left, new String[] { "", "", "ccc" }, 1) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] left, String[] right, int expected) {
        assertThat(MatchUp.solution(left, right)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void modernExamples(String[] left, String[] right, int expected) {
        assertThat(MatchUp.modern(left, right)).isEqualTo(expected);
    }
}
