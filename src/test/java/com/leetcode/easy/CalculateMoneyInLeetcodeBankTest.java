/*
 * 1716. Calculate Money in Leetcode Bank - https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CalculateMoneyInLeetcodeBankTest {
    private static final CalculateMoneyInLeetcodeBank instance = new CalculateMoneyInLeetcodeBank();

    @ParameterizedTest
    @CsvSource({"4,10", "10,37", "20, 96"})
    void examples(int n, int expected) {
        assertThat(instance.totalMoney(n)).isEqualTo(expected);
    }
}