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

class BiggerTwoTest {
    static Stream<Arguments> provider() {
        int[] a = { 1, 1 };
        int[] b = { 1, 2 };
        int[] c = { 3, 4 };

        return Stream.of( //
                Arguments.of(b, c, c), //
                Arguments.of(c, b, c), //
                Arguments.of(a, b, b) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] first, int[] second, int[] expected) {
        assertThat(BiggerTwo.solution(first, second)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void streamingExamples(int[] first, int[] second, int[] expected) {
        assertThat(BiggerTwo.streaming(first, second)).isEqualTo(expected);
    }
}
