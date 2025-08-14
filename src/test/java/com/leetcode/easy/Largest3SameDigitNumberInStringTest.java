/*
 * 2264. Largest 3-Same-Digit Number in String - https://leetcode.com/problems/largest-3-same-digit-number-in-string/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Largest3SameDigitNumberInStringTest {
    private static final Largest3SameDigitNumberInString instance = new Largest3SameDigitNumberInString();

    @ParameterizedTest
    @CsvSource({ "6777133339,777", "2300019,000", "42352338,''" })
    void examples(String input, String expected) {
        assertThat(instance.largestGoodInteger(input)).isEqualTo(expected);
    }

}