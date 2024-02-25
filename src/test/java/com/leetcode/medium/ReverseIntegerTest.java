/*
 * 7. Reverse Integer - https://leetcode.com/problems/reverse-integer/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ReverseIntegerTest {
    private static final ReverseInteger instance = new ReverseInteger();

    @ParameterizedTest
    @CsvSource({ "123,321", "-123,-321", "120,21", "2_000_000_009,0" })
    void examples(int input, int expected) {
        int actual = instance.reverse(input);
        assertThat(actual).isEqualTo(expected);
    }
}
