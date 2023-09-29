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
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class NoXTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(Arrays.asList("ax", "bb", "cx"), List.of("a", "bb", "c")), //
                Arguments.of(Arrays.asList("xxax", "xbxbx", "xxcx"), List.of("a", "bb", "c")), //
                Arguments.of(Arrays.asList("x"), List.of("")) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(List<String> input, List<String> expected) {
        assertThat(NoX.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void modernExamples(List<String> input, List<String> expected) {
        assertThat(NoX.modern(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceExamples(List<String> input, List<String> expected) {
        assertThat(NoX.inPlace(input)).isEqualTo(expected);
        assertThat(input).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "ax,a", "x,''", "a,a" })
    void cleanExamples(String input, String expected) {
        assertThat(NoX.clean(input)).isEqualTo(expected);
    }
}
