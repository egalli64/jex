/*
 * 2566. Maximum Difference by Remapping a Digit - https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MaximumDifferenceRemappingDigitTest {
    private static final MaximumDifferenceRemappingDigit instance = new MaximumDifferenceRemappingDigit();

    @ParameterizedTest
    @CsvSource({ "11891,99009", "90,99" })
    void examples(int input, int expected) {
        assertThat(instance.minMaxDifference(input)).isEqualTo(expected);
    }
}
