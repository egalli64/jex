/*
 * 2958. Length of Longest Subarray With at Most K Frequency - https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/description/
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

class LengthOfLongestSubarrayWithAtMostKFrequencyTest {
    private static final LengthOfLongestSubarrayWithAtMostKFrequency instance = new LengthOfLongestSubarrayWithAtMostKFrequency();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3, 1, 2, 3, 1, 2 }, 2, 6), //
                Arguments.of(new int[] { 1, 2, 1, 2, 1, 2, 1, 2 }, 1, 2), //
                Arguments.of(new int[] { 5, 5, 5, 5, 5, 5, 5 }, 4, 4) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int target, int expected) {
        int actual = instance.maxSubarrayLength(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
