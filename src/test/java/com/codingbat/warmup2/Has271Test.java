/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class Has271Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 7, 1 }, true), //
                Arguments.of(new int[] { 1, 2, 8, 1 }, false), //
                Arguments.of(new int[] { 2, 7, 1 }, true) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, boolean expected) {
        assertThat(Has271.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "2, -1", "2, 0", "2, 1", "2, 2", "2, 3" })
    void isGoodThird(int first, int third) {
        assertThat(Has271.isGoodThird(first, third)).isTrue();
    }
}
