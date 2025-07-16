/*
 * 3201. Find the Maximum Length of Valid Subsequence I - https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-i/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FindTheMaximumLengthOfValidSubsequenceITest {
    private static final FindTheMaximumLengthOfValidSubsequenceI instance = new FindTheMaximumLengthOfValidSubsequenceI();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[]{1, 2, 3, 4}, 4), //
                Arguments.of(new int[]{1, 2, 1, 1, 2, 1, 2}, 6), //
                Arguments.of(new int[]{1, 3}, 2) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        int actual = instance.maximumLength(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}