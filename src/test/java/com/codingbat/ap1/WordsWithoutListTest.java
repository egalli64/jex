/*
  CodingBat Java AP (Advanced Placement) 1 - https://codingbat.com/java/AP-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.ap1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class WordsWithoutListTest {
    static Stream<Arguments> provider() {
        String[] data = { "a", "bb", "b", "ccc" };
        return Stream.of( //
                Arguments.of(data, 1, List.of("bb", "ccc")), //
                Arguments.of(data, 3, List.of("a", "bb", "b")), //
                Arguments.of(data, 4, List.of("a", "bb", "b", "ccc")) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] data, int n, List<String> expected) {
        assertThat(WordsWithoutList.solution(data, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void streamingExamples(String[] data, int n, List<String> expected) {
        assertThat(WordsWithoutList.streaming(data, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void modernExamples(String[] data, int n, List<String> expected) {
        assertThat(WordsWithoutList.modern(data, n)).isEqualTo(expected);
    }
}
