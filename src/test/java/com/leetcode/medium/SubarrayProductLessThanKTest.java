/*
 * 713. Subarray Product Less Than K - https://leetcode.com/problems/subarray-product-less-than-k/description/
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

class SubarrayProductLessThanKTest {
    private static final SubarrayProductLessThanK instance = new SubarrayProductLessThanK();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 10, 5, 2, 6 }, 100, 8), //
                Arguments.of(new int[] { 1, 2, 3 }, 0, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int limit, int expected) {
        int actual = instance.numSubarrayProductLessThanK(input, limit);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
