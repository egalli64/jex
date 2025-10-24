/*
 * 2048. Next Greater Numerically Balanced Number - https://leetcode.com/problems/next-greater-numerically-balanced-number/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class NextGreaterNumericallyBalancedNumberTest {
    private static final NextGreaterNumericallyBalancedNumber instance = new NextGreaterNumericallyBalancedNumber();

    @ParameterizedTest
    @CsvSource({"1,22", "1_000,1_333", "3_000,3_133"})
    void examples(int input, int expected) {
        assertThat(instance.nextBeautifulNumber(input)).isEqualTo(expected);
    }
}
