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

class Two2Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ArrayList<Integer>(List.of(1, 2, 3)), List.of(4, 6)), //
                Arguments.of(new ArrayList<Integer>(List.of(2, 6, 11)), List.of(4)), //
                Arguments.of(new ArrayList<Integer>(List.of(0)), List.of(0)) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(List<Integer> input, List<Integer> expected) {
        assertThat(Two2.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceExamples(List<Integer> input, List<Integer> expected) {
        assertThat(Two2.inPlace(input)).isEqualTo(expected);
        assertThat(input).isEqualTo(expected);
    }
}
