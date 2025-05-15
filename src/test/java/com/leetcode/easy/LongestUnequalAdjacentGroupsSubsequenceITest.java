/*
 * 2900. Longest Unequal Adjacent Groups Subsequence I - https://leetcode.com/problems/add-binary/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.List;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestUnequalAdjacentGroupsSubsequenceITest {
    private static final LongestUnequalAdjacentGroupsSubsequenceI instance = new LongestUnequalAdjacentGroupsSubsequenceI();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[] { "e", "a", "b" }, new int[] { 0, 0, 1 }, List.of("e", "b")), //
                Arguments.of(new String[] { "a", "b", "c", "d" }, new int[] { 1, 0, 1, 1 }, List.of("a", "b", "c")) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] words, int[] groups, List<String> expected) {
        var actual = instance.getLongestSubsequence(words, groups);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
