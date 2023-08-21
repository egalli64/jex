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

class GroupSum6Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 5, 6, 2 }, 8, true), //
                Arguments.of(new int[] { 5, 6, 2 }, 9, false), //
                Arguments.of(new int[] { 5, 6, 2 }, 7, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void groupSum6Examples(int[] data, int target, boolean expected) {
        assertThat(GroupSum6.groupSum6(0, data, target)).isEqualTo(expected);
    }
}
