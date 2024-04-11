/*
 * 402. Remove K Digits - https://leetcode.com/problems/remove-k-digits/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RemoveKDigitsTest {
    private static final RemoveKDigits instance = new RemoveKDigits();

    @ParameterizedTest
    @CsvSource({ "1432219,3,1219", "10200,1,200", "10,2,0" })
    void examples(String input, int del, String expected) {
        String actual = instance.removeKdigits(input, del);
        assertThat(actual).isEqualTo(expected);
    }
}
