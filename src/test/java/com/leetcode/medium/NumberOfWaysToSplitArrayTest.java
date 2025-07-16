/*
 * 2270. Number of Ways to Split Array - https://leetcode.com/problems/number-of-ways-to-split-array/description/
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

class NumberOfWaysToSplitArrayTest {
    private static final NumberOfWaysToSplitArray instance = new NumberOfWaysToSplitArray();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 10, 4, -8, 7 }, 2), //
                Arguments.of(new int[] { 2, 3, 1, 0 }, 2) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, long expected) {
        long actual = instance.waysToSplitArray(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}
