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

class PairsTest {
    static Stream<Arguments> provider() {
        String[] in1 = { "code", "bug" };
        var expected1 = Map.of("b", "g", "c", "e");

        String[] in2 = { "man", "moon", "main" };
        var expected2 = Map.of("m", "n");

        String[] in3 = { "man", "moon", "good", "night" };
        var expected3 = Map.of("g", "d", "m", "n", "n", "t");

        return Stream.of( //
                Arguments.of(in1, expected1), //
                Arguments.of(in2, expected2), //
                Arguments.of(in3, expected3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] input, Map<String, String> expected) {
        assertThat(Pairs.solution(input)).isEqualTo(expected);
    }
}
