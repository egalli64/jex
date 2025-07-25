/*
 * 3487. Maximum Unique Subarray Sum After Deletion - https://leetcode.com/problems/maximum-unique-subarray-sum-after-deletion/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MaximumUniqueSubarraySumAfterDeletionTest {
    private static final MaximumUniqueSubarraySumAfterDeletion instance = new MaximumUniqueSubarraySumAfterDeletion();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 15), //
                Arguments.of(new int[]{1, 1, 0, 1, 1}, 1), //
                Arguments.of(new int[]{1, 2, -1, -2, 1, 0, -1}, 3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.maxSum(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}