/*
 * 2099. Find Subsequence of Length K With the Largest Sum - https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/description/
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

class FindSubsequenceOfLengthKWithLargestSumTest {
    private static final FindSubsequenceOfLengthKWithLargestSum instance = new FindSubsequenceOfLengthKWithLargestSum();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 1, 3, 3 }, 2, new int[] { 3, 3 }), //
                Arguments.of(new int[] { -1, -2, 3, 4 }, 3, new int[] { -1, 3, 4 }), //
                Arguments.of(new int[] { 3, 4, 3, 3 }, 2, new int[] { 3, 4 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int k, int[] expected) {
        var actual = instance.maxSubsequence(input, k);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
