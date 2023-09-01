/*
  CodingBat Map 1 - https://codingbat.com/java/Map-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MapBullyTest {
    static Stream<Arguments> provider() {
        var in1 = new HashMap<>(Map.of("a", "candy", "b", "dirt"));
        var in2 = new HashMap<>(Map.of("a", "candy"));
        var expected12 = Map.of("a", "", "b", "candy");

        var in3 = new HashMap<>(Map.of("a", "candy", "b", "carrot", "c", "meh"));
        var expected3 = Map.of("a", "", "b", "candy", "c", "meh");

        return Stream.of( //
                Arguments.of(in1, expected12), //
                Arguments.of(in2, expected12), //
                Arguments.of(in3, expected3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(Map<String, String> input, Map<String, String> expected) {
        assertThat(MapBully.solution(input)).isEqualTo(expected);
    }
}
