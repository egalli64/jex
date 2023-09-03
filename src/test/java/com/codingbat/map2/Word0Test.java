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

class Word0Test {
    static Stream<Arguments> provider() {
        String[] in1 = { "a", "b", "a", "b" };
        var expected1 = Map.of("a", 0, "b", 0);

        String[] in2 = { "a", "b", "a", "c", "b" };
        var expected2 = Map.of("a", 0, "b", 0, "c", 0);

        String[] in3 = { "c", "b", "a" };
        var expected3 = Map.of("a", 0, "b", 0, "c", 0);

        return Stream.of( //
                Arguments.of(in1, expected1), //
                Arguments.of(in2, expected2), //
                Arguments.of(in3, expected3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] input, Map<String, String> expected) {
        assertThat(Word0.solution(input)).isEqualTo(expected);
    }
}
