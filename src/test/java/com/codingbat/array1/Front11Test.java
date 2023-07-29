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

class Front11Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3 }, new int[] { 7, 9, 8 }, new int[] { 1, 7 }), //
                Arguments.of(new int[] { 1 }, new int[] { 2 }, new int[] { 1, 2 }), //
                Arguments.of(new int[] { 1, 7 }, new int[] {}, new int[] { 1 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] first, int[] second, int[] expected) {
        assertThat(Front11.solution(first, second)).isEqualTo(expected);
    }
}
