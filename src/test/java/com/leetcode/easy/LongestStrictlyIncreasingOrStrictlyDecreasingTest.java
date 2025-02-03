/*
 * 3105. Longest Strictly Increasing or Strictly Decreasing - https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestStrictlyIncreasingOrStrictlyDecreasingTest {
    private static final LongestStrictlyIncreasingOrStrictlyDecreasing instance = new LongestStrictlyIncreasingOrStrictlyDecreasing();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 4, 3, 3, 2 }, 2), //
                Arguments.of(new int[] { 3, 3, 3, 3 }, 1), //
                Arguments.of(new int[] { 3, 2, 1 }, 3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.longestMonotonicSubarray(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
