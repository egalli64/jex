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

class MaxTripleTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3 }, 3), //
                Arguments.of(new int[] { 1, 5, 3 }, 5), //
                Arguments.of(new int[] { 5, 2, 3 }, 5) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, int expected) {
        assertThat(MaxTriple.solution(input)).isEqualTo(expected);
    }
}
