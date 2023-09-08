/*
  CodingBat Functional 2 - https://codingbat.com/java/Functional-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class No34Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ArrayList<String>(List.of("a", "bb", "ccc")), List.of("a", "bb")), //
                Arguments.of(new ArrayList<String>(List.of("a", "bb", "ccc", "dddd")), List.of("a", "bb")), //
                Arguments.of(new ArrayList<String>(List.of("ccc", "dddd", "apple")), List.of("apple")) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(List<String> input, List<String> expected) {
        assertThat(No34.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceExamples(List<String> input, List<String> expected) {
        assertThat(No34.inPlace(input)).isEqualTo(expected);
        assertThat(input).isEqualTo(expected);
    }
}
