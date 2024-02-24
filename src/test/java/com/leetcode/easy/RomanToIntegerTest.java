/*
 * 13. Roman to Integer - https://leetcode.com/problems/roman-to-integer/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanToIntegerTest {
    private static final RomanToInteger instance = new RomanToInteger();

    @ParameterizedTest
    @CsvSource({ "III,3", "LVIII,58", "MCMXCIV,1994" })
    void romanToIntExamples(String input, int expected) {
        int actual = instance.romanToInt(input);
        assertThat(actual).isEqualTo(expected);
    }
}
