/*
 * 1544. Make The String Great - https://leetcode.com/problems/make-the-string-great/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MakeTheStringGreatTest {
    private static final MakeTheStringGreat instance = new MakeTheStringGreat();

    @ParameterizedTest
    @CsvSource({ "leEeetcode,leetcode", "abBAcC,''", "s,s" })
    void examples(String input, String expected) {
        assertThat(instance.makeGood(input)).isEqualTo(expected);
    }
}
