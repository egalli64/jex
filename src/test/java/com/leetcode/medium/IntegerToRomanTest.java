/*
 * 12. Integer to Roman - https://leetcode.com/problems/integer-to-roman/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class IntegerToRomanTest {
    private static final IntegerToRoman instance = new IntegerToRoman();

    @ParameterizedTest
    @CsvSource({ "3,III", "58,LVIII", "1994,MCMXCIV" })
    void examples(int input, String expected) {
        String actual = instance.intToRoman(input);
        assertThat(actual).isEqualTo(expected);
    }
}
