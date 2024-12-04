/*
 * 2825. Make String a Subsequence Using Cyclic Increments - https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MakeStringASubsequenceUsingCyclicIncrementsTest {
    private static final MakeStringASubsequenceUsingCyclicIncrements instance = new MakeStringASubsequenceUsingCyclicIncrements();

    @ParameterizedTest
    @CsvSource({ "abc,ad,true", "zc,ad,true", "ab,d,false" })
    void examples(String input, String target, boolean expected) {
        boolean actual = instance.canMakeSubsequence(input, target);
        assertThat(actual).isEqualTo(expected);
    }
}
