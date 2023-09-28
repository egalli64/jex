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

class MoreYTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(Arrays.asList("a", "b", "c"), List.of("yay", "yby", "ycy")), //
                Arguments.of(Arrays.asList("hello", "there"), List.of("yhelloy", "ytherey")), //
                Arguments.of(Arrays.asList("yay"), List.of("yyayy")) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(List<String> input, List<String> expected) {
        assertThat(MoreY.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void modernExamples(List<String> input, List<String> expected) {
        assertThat(MoreY.modern(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceExamples(List<String> input, List<String> expected) {
        assertThat(MoreY.inPlace(input)).isEqualTo(expected);
        assertThat(input).isEqualTo(expected);
    }
}
