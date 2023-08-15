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

class TenRunTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 10, 3, 4, 20, 5 }, new int[] { 2, 10, 10, 10, 20, 20 }), //
                Arguments.of(new int[] { 10, 1, 20, 2 }, new int[] { 10, 10, 20, 20 }), //
                Arguments.of(new int[] { 10, 1, 9, 20 }, new int[] { 10, 10, 10, 20 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, int[] expected) {
        assertThat(TenRun.solution(data)).isEqualTo(expected);
    }
}
