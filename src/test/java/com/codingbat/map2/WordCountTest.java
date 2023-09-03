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

class WordCountTest {
    static Stream<Arguments> provider() {
        String[] in1 = { "a", "b", "a", "c", "b" };
        var expected1 = Map.of("a", 2, "b", 2, "c", 1);

        String[] in2 = { "c", "b", "a" };
        var expected2 = Map.of("a", 1, "b", 1, "c", 1);

        String[] in3 = { "c", "c", "c", "c" };
        var expected3 = Map.of("c", 4);

        return Stream.of( //
                Arguments.of(in1, expected1), //
                Arguments.of(in2, expected2), //
                Arguments.of(in3, expected3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] input, Map<String, Integer> expected) {
        assertThat(WordCount.solution(input)).isEqualTo(expected);
    }
}
