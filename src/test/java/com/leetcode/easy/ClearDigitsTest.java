/*
 * 3174. Clear Digits - https://leetcode.com/problems/clear-digits/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ClearDigitsTest {
    private static final ClearDigits instance = new ClearDigits();

    @ParameterizedTest
    @CsvSource({ "abc,abc", "cb34,''" })
    void examples(String input, String expected) {
        assertThat(instance.clearDigits(input)).isEqualTo(expected);
    }
}
