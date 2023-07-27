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

class MakeLastTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 4, 5, 6 }, new int[] { 0, 0, 0, 0, 0, 6 }), //
                Arguments.of(new int[] { 1, 2 }, new int[] { 0, 0, 0, 2 }), //
                Arguments.of(new int[] { 3 }, new int[] { 0, 3 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] input, int[] expected) {
        assertThat(MakeLast.solution(input)).isEqualTo(expected);
    }
}
