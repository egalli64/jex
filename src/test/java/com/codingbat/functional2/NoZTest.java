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

class NoZTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new ArrayList<String>(List.of("aaa", "bbb", "aza")), List.of("aaa", "bbb")), //
                Arguments.of(new ArrayList<String>(List.of("hziz", "hzello", "hi")), List.of("hi")), //
                Arguments.of(new ArrayList<String>(List.of("hello", "howz", "are", "youz")), List.of("hello", "are")) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(List<String> input, List<String> expected) {
        assertThat(NoZ.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceExamples(List<String> input, List<String> expected) {
        assertThat(NoZ.inPlace(input)).isEqualTo(expected);
        assertThat(input).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void compactModernExamples(List<String> input, List<String> expected) {
        assertThat(NoZ.compactModern(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "aaa, true", "'', true", "aza, false" })
    void noZ(String input, boolean expected) {
        assertThat(NoZ.noZ(input)).isEqualTo(expected);
    }
}
