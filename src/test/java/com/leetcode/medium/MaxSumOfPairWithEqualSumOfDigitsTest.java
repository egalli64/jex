/*
 * 2342. Max Sum of a Pair With Equal Sum of Digits - https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/description/
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

class MaxSumOfPairWithEqualSumOfDigitsTest {
    private static final MaxSumOfPairWithEqualSumOfDigits instance = new MaxSumOfPairWithEqualSumOfDigits();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 18, 43, 36, 13, 7 }, 54), //
                Arguments.of(new int[] { 10, 12, 19, 14 }, -1), //
                Arguments.of(new int[] { 4, 6, 10, 6 }, 12), // duplicates
                Arguments.of(new int[] { 100, 6, 100, 6 }, 200) // three digits
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.maximumSum(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
