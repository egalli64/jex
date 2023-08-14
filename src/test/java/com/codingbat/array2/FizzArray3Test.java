/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FizzArray3Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(5, 10, new int[] { 5, 6, 7, 8, 9 }), //
                Arguments.of(11, 18, new int[] { 11, 12, 13, 14, 15, 16, 17 }), //
                Arguments.of(1, 3, new int[] { 1, 2 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int begin, int end, int[] expected) {
        assertThat(FizzArray3.solution(begin, end)).isEqualTo(expected);
    }
}
