/*
 * 1800. Maximum Ascending Subarray Sum - https://leetcode.com/problems/maximum-ascending-subarray-sum/description/
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

class MaximumAscendingSubarraySumTest {
    private static final MaximumAscendingSubarraySum instance = new MaximumAscendingSubarraySum();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 100, 10, 1 }, 100), //
                Arguments.of(new int[] { 10, 20, 30, 5, 10, 50 }, 65), //
                Arguments.of(new int[] { 10, 20, 30, 40, 50 }, 150), //
                Arguments.of(new int[] { 12, 17, 15, 13, 10, 11, 12 }, 33) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.maxAscendingSum(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
