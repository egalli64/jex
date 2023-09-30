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

class FirstCharTest {
    static Stream<Arguments> provider() {
        String[] in1 = { "salt", "tea", "soda", "toast" };
        var expected1 = Map.of("s", "saltsoda", "t", "teatoast");

        String[] in2 = { "aa", "bb", "cc", "aAA", "cCC", "d" };
        var expected2 = Map.of("a", "aaaAA", "b", "bb", "c", "cccCC", "d", "d");

        String[] in3 = {};
        var expected3 = Map.of();

        return Stream.of( //
                Arguments.of(in1, expected1), //
                Arguments.of(in2, expected2), //
                Arguments.of(in3, expected3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] input, Map<String, Integer> expected) {
        assertThat(FirstChar.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void classicExamples(String[] input, Map<String, Integer> expected) {
        assertThat(FirstChar.classic(input)).isEqualTo(expected);
    }
}
