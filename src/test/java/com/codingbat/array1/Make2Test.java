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

class Make2Test {
    static Stream<Arguments> provider() {
        int[] a = { 4, 5 };
        int[] b = { 1, 2, 3 };
        int[] c = { 1, 2 };
        return Stream.of( //
                Arguments.of(a, b, a), //
                Arguments.of(new int[] { 4 }, b, new int[] { 4, 1 }), //
                Arguments.of(new int[] {}, c, c) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] first, int[] second, int[] expected) {
        assertThat(Make2.solution(first, second)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void unsupportedExamples(int[] first, int[] second, int[] expected) {
        assertThat(Make2.unsupported(first, second)).isEqualTo(expected);
    }
}
