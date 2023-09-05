/*
  CodingBat Functional 1 - https://codingbat.com/java/Functional-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SquareTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(Arrays.asList(1, 2, 3), List.of(1, 4, 9)), //
                Arguments.of(Arrays.asList(6, 8, 6, 8, -1), List.of(36, 64, 36, 64, 1)), //
                Arguments.of(Arrays.asList(), List.of()) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(List<Integer> input, List<Integer> expected) {
        assertThat(Square.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void modernExamples(List<Integer> input, List<Integer> expected) {
        assertThat(Square.modern(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceExamples(List<Integer> input, List<Integer> expected) {
        assertThat(Square.inPlace(input)).isEqualTo(expected);
        assertThat(input).isEqualTo(expected);
    }
}
