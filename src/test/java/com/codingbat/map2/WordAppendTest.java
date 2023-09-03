/*
  CodingBat Map 2 - https://codingbat.com/java/Map-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class WordAppendTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[] { "a", "b", "a" }, "a"), //
                Arguments.of(new String[] { "a", "b", "a", "c", "a", "d", "a" }, "aa"), //
                Arguments.of(new String[] { "a", "", "a" }, "a") //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] input, String expected) {
        assertThat(WordAppend.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void bySetExamples(String[] input, String expected) {
        assertThat(WordAppend.bySet(input)).isEqualTo(expected);
    }
}
