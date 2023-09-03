/*
  CodingBat Map 2 - https://codingbat.com/java/Map-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class WordLenTest {
    static Stream<Arguments> provider() {
        String[] in1 = { "a", "bb", "a", "bb" };
        var expected1 = Map.of("bb", 2, "a", 1);

        String[] in2 = { "this", "and", "that", "and" };
        var expected2 = Map.of("that", 4, "and", 3, "this", 4);

        String[] in3 = { "code", "code", "code", "bug" };
        var expected3 = Map.of("code", 4, "bug", 3);

        return Stream.of( //
                Arguments.of(in1, expected1), //
                Arguments.of(in2, expected2), //
                Arguments.of(in3, expected3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] input, Map<String, String> expected) {
        assertThat(WordLen.solution(input)).isEqualTo(expected);
    }
}
