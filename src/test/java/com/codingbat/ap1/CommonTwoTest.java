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

class CommonTwoTest {
    static Stream<Arguments> provider() {
        String[] abc = { "a", "b", "c" };
        String[] acx = { "a", "c", "x" };
        return Stream.of( //
                Arguments.of(acx, new String[] { "b", "c", "d", "x" }, 2), //
                Arguments.of(acx, new String[] { "a", "b", "c", "x", "z" }, 3), //
                Arguments.of(abc, abc, 3));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] left, String[] right, int expected) {
        assertThat(CommonTwo.solution(left, right)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void intersectionExamples(String[] left, String[] right, int expected) {
        assertThat(CommonTwo.intersection(left, right)).isEqualTo(expected);
    }
}
