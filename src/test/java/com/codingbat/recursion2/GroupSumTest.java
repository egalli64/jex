/*
  CodingBat Java Recursion 2 - https://codingbat.com/java/Recursion-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GroupSumTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 4, 8 }, 10, true), //
                Arguments.of(new int[] { 2, 4, 8 }, 14, true), //
                Arguments.of(new int[] { 2, 4, 8 }, 9, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void groupSumExamples(int[] data, int target, boolean expected) {
        assertThat(GroupSum.groupSum(0, data, target)).isEqualTo(expected);
    }

    @Test
    void groupSumNegative() {
        int[] values = { -2, 5, 8 };
        int target = 6;
        assertThat(GroupSum.groupSum(0, values, target)).isTrue();
    }
}
