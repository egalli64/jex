/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Unlucky1Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 3, 4, 5 }, true), //
                Arguments.of(new int[] { 2, 1, 3, 4, 5 }, true), //
                Arguments.of(new int[] { 1, 1, 1 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, boolean expected) {
        assertThat(Unlucky1.solution(input)).isEqualTo(expected);
    }
}
