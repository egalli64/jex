/*
 * 1. Two Sum - https://leetcode.com/problems/two-sum/description/
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

class TwoSumTest {
    private static final TwoSum instance = new TwoSum();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 7, 11, 15 }, 9, new int[] { 0, 1 }), //
                Arguments.of(new int[] { 3, 2, 4 }, 6, new int[] { 1, 2 }), //
                Arguments.of(new int[] { 3, 3 }, 6, new int[] { 0, 1 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] nums, int target, int[] expected) {
        int[] actual = instance.twoSum(nums, target);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }
    

    @ParameterizedTest
    @MethodSource("provider")
    void examplesLinear(int[] nums, int target, int[] expected) {
        int[] actual = instance.linear(nums, target);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }
}
