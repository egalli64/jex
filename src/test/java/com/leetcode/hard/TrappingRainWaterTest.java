/*
 * 42. Trapping Rain Water - https://leetcode.com/problems/trapping-rain-water/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TrappingRainWaterTest {
    private static final TrappingRainWater instance = new TrappingRainWater();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }, 6), //
                Arguments.of(new int[] { 4, 2, 0, 3, 2, 5 }, 9) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        int actual = instance.trap(input);
        assertThat(actual).isEqualTo(expected);
    }
}
