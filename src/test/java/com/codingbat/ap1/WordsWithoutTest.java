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

class WordsWithoutTest {
    static Stream<Arguments> provider() {
        String[] words = { "a", "b", "c", "a" };
        return Stream.of( //
                Arguments.of(words, "a", new String[] { "b", "c" }), //
                Arguments.of(words, "b", new String[] { "a", "c", "a" }), //
                Arguments.of(words, "c", new String[] { "a", "b", "a" }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] words, String target, String[] expected) {
        assertThat(WordsWithout.solution(words, target)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void byArrayCopyExamples(String[] words, String target, String[] expected) {
        assertThat(WordsWithout.byArrayCopy(words, target)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void byStreamExamples(String[] words, String target, String[] expected) {
        assertThat(WordsWithout.byStream(words, target)).isEqualTo(expected);
    }
}
