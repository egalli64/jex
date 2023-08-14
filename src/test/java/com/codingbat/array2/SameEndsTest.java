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

class SameEndsTest {
    static Stream<Arguments> provider() {
        int[] target = new int[] { 5, 6, 45, 99, 13, 5, 6 };
        return Stream.of( //
                Arguments.of(target, 1, false), //
                Arguments.of(target, 2, true), //
                Arguments.of(target, 3, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, int len, boolean expected) {
        assertThat(SameEnds.solution(data, len)).isEqualTo(expected);
    }
}
