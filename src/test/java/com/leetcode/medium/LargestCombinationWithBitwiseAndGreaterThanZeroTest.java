/*
 * 2275. Largest Combination With Bitwise AND Greater Than Zero - https://leetcode.com/problems/largest-combination-with-bitwise-and-greater-than-zero/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LargestCombinationWithBitwiseAndGreaterThanZeroTest {
    private static final LargestCombinationWithBitwiseAndGreaterThanZero instance = new LargestCombinationWithBitwiseAndGreaterThanZero();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 8388608 }, 1), //
                Arguments.of(new int[] { 16, 17, 71, 62, 12, 24, 14 }, 4), //
                Arguments.of(new int[] { 8, 8 }, 2) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        int actual = instance.largestCombination(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
