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

class Topping2Test {
    static Stream<Arguments> provider() {
        var in1 = new HashMap<>(Map.of("ice cream", "cherry"));
        var expected1 = Map.of("yogurt", "cherry", "ice cream", "cherry");

        var in2 = new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry"));
        var expected2 = Map.of("yogurt", "cherry", "spinach", "nuts", "ice cream", "cherry");

        var expected3 = Map.of("yogurt", "salt");
        var in3 = new HashMap<>(expected3);

        return Stream.of( //
                Arguments.of(in1, expected1), //
                Arguments.of(in2, expected2), //
                Arguments.of(in3, expected3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(Map<String, String> input, Map<String, String> expected) {
        assertThat(Topping2.solution(input)).isEqualTo(expected);
    }
}
