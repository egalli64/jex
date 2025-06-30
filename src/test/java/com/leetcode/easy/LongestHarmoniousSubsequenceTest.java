/*
 * 594. Longest Harmonious Subsequence - https://leetcode.com/problems/add-binary/description/
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

class LongestHarmoniousSubsequenceTest {
    private static final LongestHarmoniousSubsequence instance = new LongestHarmoniousSubsequence();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 3, 2, 2, 5, 2, 3, 7 }, 5), //
                Arguments.of(new int[] { 1, 2, 3, 4 }, 2), //
                Arguments.of(new int[] { 1, 1, 1, 1 }, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.findLHS(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
