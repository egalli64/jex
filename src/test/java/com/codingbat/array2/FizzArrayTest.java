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

class FizzArrayTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(4, new int[] { 0, 1, 2, 3 }), //
                Arguments.of(1, new int[] { 0 }), //
                Arguments.of(10, new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int input, int[] expected) {
        assertThat(FizzArray.solution(input)).isEqualTo(expected);
    }
}
