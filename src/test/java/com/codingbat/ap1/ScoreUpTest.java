/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class ScoreUpTest {
    static Stream<Arguments> provider() {
        String[] keys = { "a", "a", "b", "b" };
        return Stream.of( //
                Arguments.of(keys, new String[] { "a", "c", "b", "c" }, 6), //
                Arguments.of(keys, new String[] { "a", "a", "b", "c" }, 11), //
                Arguments.of(keys, new String[] { "a", "a", "b", "b" }, 16) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] keys, String[] answers, int expected) {
        assertThat(ScoreUp.solution(keys, answers)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void modernExamples(String[] keys, String[] answers, int expected) {
        assertThat(ScoreUp.modern(keys, answers)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "a,a,4", "a,b,-1", "a,?,0" })
    void mapperPlain(String key, String answer, int expected) {
        assertThat(ScoreUp.mapper(key, answer)).isEqualTo(expected);
    }
}
