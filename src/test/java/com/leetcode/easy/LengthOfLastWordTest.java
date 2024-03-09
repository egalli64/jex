/*
 * 58. Length of Last Word - https://leetcode.com/problems/length-of-last-word/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LengthOfLastWordTest {
    private static final LengthOfLastWord instance = new LengthOfLastWord();

    @ParameterizedTest
    @CsvSource({ "Hello World,5", "'   fly me   to   the moon  ', 4", "luffy is still joyboy, 6" })
    void examples(String input, int expected) {
        int actual = instance.lengthOfLastWord(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
