/*
  CodingBat Java Recursion 2 - https://codingbat.com/java/Recursion-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SplitOdd10Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 5, 5, 5 }, true), //
                Arguments.of(new int[] { 5, 5, 6 }, false), //
                Arguments.of(new int[] { 5, 5, 6, 1 }, true) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, boolean expected) {
        assertThat(SplitOdd10.solution(data)).isEqualTo(expected);
    }
}
