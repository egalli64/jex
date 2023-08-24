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

class WordsFrontTest {
    static Stream<Arguments> provider() {
        String[] data = { "a", "b", "c", "d" };
        return Stream.of( //
                Arguments.of(data, 1, new String[] { "a" }), //
                Arguments.of(data, 2, new String[] { "a", "b" }), //
                Arguments.of(data, 3, new String[] { "a", "b", "c" }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] data, int n, String[] expected) {
        assertThat(WordsFront.solution(data, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void delegatorExamples(String[] data, int n, String[] expected) {
        assertThat(WordsFront.delegator(data, n)).isEqualTo(expected);
    }
}
