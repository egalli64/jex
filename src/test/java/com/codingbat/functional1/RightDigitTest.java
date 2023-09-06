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

class RightDigitTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(Arrays.asList(1, 22, 93), List.of(1, 2, 3)), //
                Arguments.of(Arrays.asList(16, 8, 886, 8, 1), List.of(6, 8, 6, 8, 1)), //
                Arguments.of(Arrays.asList(10, 0), List.of(0, 0)) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(List<Integer> input, List<Integer> expected) {
        assertThat(RightDigit.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceExamples(List<Integer> input, List<Integer> expected) {
        assertThat(RightDigit.inPlace(input)).isEqualTo(expected);
        assertThat(input).isEqualTo(expected);
    }
}
