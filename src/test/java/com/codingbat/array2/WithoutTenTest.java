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

class WithoutTenTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 10, 10, 2 }, new int[] { 1, 2, 0, 0 }), //
                Arguments.of(new int[] { 10, 2, 10 }, new int[] { 2, 0, 0 }), //
                Arguments.of(new int[] { 1, 99, 10 }, new int[] { 1, 99, 0 }), //
                Arguments.of(new int[] { 10, 13, 10, 14 }, new int[] { 13, 14, 0, 0 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, int[] expected) {
        assertThat(WithoutTen.solution(data)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceSelectionExamples(int[] data, int[] expected) {
        assertThat(WithoutTen.inPlaceSelection(data)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceBubbleExamples(int[] data, int[] expected) {
        assertThat(WithoutTen.inPlaceBubble(data)).isEqualTo(expected);
    }
}
