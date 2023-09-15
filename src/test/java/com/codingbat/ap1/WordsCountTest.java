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

class WordsCountTest {
    static Stream<Arguments> provider() {
        String[] data = { "a", "bb", "b", "ccc" };
        return Stream.of( //
                Arguments.of(data, 1, 2), //
                Arguments.of(data, 3, 1), //
                Arguments.of(data, 4, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] data, int len, int expected) {
        assertThat(WordsCount.solution(data, len)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void modernExamples(String[] data, int len, int expected) {
        assertThat(WordsCount.modern(data, len)).isEqualTo(expected);
    }
}
