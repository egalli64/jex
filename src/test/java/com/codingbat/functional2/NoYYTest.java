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

class NoYYTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ArrayList<String>(List.of("a", "b", "c")), List.of("ay", "by", "cy")), //
                Arguments.of(new ArrayList<String>(List.of("a", "b", "cy")), List.of("ay", "by")), //
                Arguments.of(new ArrayList<String>(List.of("xx", "ya", "zz")), List.of("xxy", "yay", "zzy")) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(List<String> input, List<String> expected) {
        assertThat(NoYY.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void compactModernExamples(List<String> input, List<String> expected) {
        assertThat(NoYY.compactModern(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceExamples(List<String> input, List<String> expected) {
        assertThat(NoYY.inPlace(input)).isEqualTo(expected);
        assertThat(input).isEqualTo(expected);
    }
}
