/*
 * 3110. Score of a String - https://leetcode.com/problems/score-of-a-string/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ScoreOfStringTest {
    private static final ScoreOfString instance = new ScoreOfString();

    @ParameterizedTest
    @CsvSource({ "hello,13", "zaz,50" })
    void examples(String input, int expected) {
        assertThat(instance.scoreOfString(input)).isEqualTo(expected);
    }
}
