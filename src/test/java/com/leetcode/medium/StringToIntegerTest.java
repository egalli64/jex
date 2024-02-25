/*
 * 8. String to Integer (atoi) - https://leetcode.com/problems/string-to-integer-atoi/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringToIntegerTest {
    private static final StringToInteger instance = new StringToInteger();

    @ParameterizedTest
    @CsvSource({ "42,42", "'   -42',-42", "4193 with words,4193", "9223372036854775808,2147483647" })
    void examples(String input, int expected) {
        int actual = instance.myAtoi(input);
        assertThat(actual).isEqualTo(expected);
    }
}
