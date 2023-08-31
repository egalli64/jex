/*
  CodingBat Array 3 - https://codingbat.com/java/Array-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.array3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LinearInTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 4, 6 }, new int[] { 2, 4 }, true), //
                Arguments.of(new int[] { 1, 2, 4, 6 }, new int[] { 2, 3, 4 }, false), //
                Arguments.of(new int[] { 1, 2, 4, 4, 6 }, new int[] { 2, 4 }, true) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] outer, int[] inner, boolean expected) {
        assertThat(LinearIn.solution(outer, inner)).isEqualTo(expected);
    }
}
