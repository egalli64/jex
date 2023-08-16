/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NotAloneTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3 }, 2, new int[] { 1, 3, 3 }), //
                Arguments.of(new int[] { 1, 2, 3, 2, 5, 2 }, 2, new int[] { 1, 3, 3, 5, 5, 2 }), //
                Arguments.of(new int[] { 3, 4 }, 3, new int[] { 3, 4 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, int value, int[] expected) {
        assertThat(NotAlone.solution(data, value)).isEqualTo(expected);
    }

    @Test
    void solutionWontChangeNotAlone() {
        int[] input = { 1, 1, 1, 2 };
        int value = 1;
        int[] expected = { 1, 1, 1, 2 };
        assertThat(NotAlone.solution(input, value)).isEqualTo(expected);
    }
}
