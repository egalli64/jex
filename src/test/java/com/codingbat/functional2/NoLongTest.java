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

class NoLongTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ArrayList<String>(List.of("this", "not", "too", "long")), List.of("not", "too")), //
                Arguments.of(new ArrayList<String>(List.of("a", "bbb", "cccc")), List.of("a", "bbb")), //
                Arguments.of(new ArrayList<String>(List.of("cccc", "cccc", "cccc")), List.of()) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(List<String> input, List<String> expected) {
        assertThat(NoLong.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceExamples(List<String> input, List<String> expected) {
        assertThat(NoLong.inPlace(input)).isEqualTo(expected);
        assertThat(input).isEqualTo(expected);
    }
}
