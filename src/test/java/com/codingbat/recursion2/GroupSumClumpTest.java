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

class GroupSumClumpTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 4, 8 }, 10, true), //
                Arguments.of(new int[] { 1, 2, 4, 8, 1 }, 14, true), //
                Arguments.of(new int[] { 2, 4, 4, 8 }, 14, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void groupSum5Examples(int[] data, int target, boolean expected) {
        assertThat(GroupSumClump.groupSumClump(0, data, target)).isEqualTo(expected);
    }
}
