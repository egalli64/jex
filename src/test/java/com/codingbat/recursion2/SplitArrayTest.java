/*
  CodingBat Java Recursion 2 - https://codingbat.com/java/Recursion-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SplitArrayTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 2 }, true), //
                Arguments.of(new int[] { 2, 3 }, false), //
                Arguments.of(new int[] { 5, 2, 3 }, true) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void groupSum5Examples(int[] data, boolean expected) {
        assertThat(SplitArray.solution(data)).isEqualTo(expected);
    }
}
