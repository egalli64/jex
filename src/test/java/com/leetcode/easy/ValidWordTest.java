/*
 * 3136. Valid Word - https://leetcode.com/problems/valid-word/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ValidWordTest {
    private static final ValidWord instance = new ValidWord();

    @ParameterizedTest
    @CsvSource({"234Adas,true", "b3,false", "a3$e,false", "AhI, true"})
    void examples(String input, boolean expected) {
        assertThat(instance.isValid(input)).isEqualTo(expected);
    }
}
