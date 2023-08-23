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

class TwoTwoTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 4, 2, 2, 3 }, true), //
                Arguments.of(new int[] { 2, 2, 4 }, true), //
                Arguments.of(new int[] { 2, 2, 4, 2 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, boolean expected) {
        assertThat(TwoTwo.solution(data)).isEqualTo(expected);
    }

    static Stream<Arguments> baseProvider() {
        return Stream.of( //
                Arguments.of(new int[] {}, true), //
                Arguments.of(new int[] { 2 }, false), //
                Arguments.of(new int[] { 1 }, true), //
                Arguments.of(new int[] { 2, 2 }, true), //
                Arguments.of(new int[] { 1, 2 }, false), //
                Arguments.of(new int[] { 2, 1 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("baseProvider")
    void solutionBase(int[] data, boolean expected) {
        assertThat(TwoTwo.solution(data)).isEqualTo(expected);
    }
}
