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
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class Square56Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ArrayList<Integer>(List.of(3, 1, 4)), List.of(19, 11)), //
                Arguments.of(new ArrayList<Integer>(List.of(1)), List.of(11)), //
                Arguments.of(new ArrayList<Integer>(List.of(2)), List.of(14)) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(List<Integer> input, List<Integer> expected) {
        assertThat(Square56.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void alternativeExamples(List<Integer> input, List<Integer> expected) {
        assertThat(Square56.alternative(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void compactModernExamples(List<Integer> input, List<Integer> expected) {
        assertThat(Square56.compactModern(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceExamples(List<Integer> input, List<Integer> expected) {
        assertThat(Square56.inPlace(input)).isEqualTo(expected);
        assertThat(input).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "3, false", "4, true", "7, false" })
    void endsBy456AlternativeExamples(int input, boolean expected) {
        assertThat(Square56.endsBy456Alternative(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "3, true", "4, false", "7, true" })
    void notEndingBy456AlternativeExamples(int input, boolean expected) {
        assertThat(Square56.notEndingBy456Alternative(input)).isEqualTo(expected);
    }
}
