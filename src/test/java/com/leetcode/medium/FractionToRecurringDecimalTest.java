/*
 * 166. Fraction to Recurring Decimal - https://leetcode.com/problems/fraction-to-recurring-decimal/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FractionToRecurringDecimalTest {
    private static final FractionToRecurringDecimal instance = new FractionToRecurringDecimal();

    @ParameterizedTest
    @CsvSource({"1,2,0.5", "2,1,2", "4,333,0.(012)"})
    void examples(int numerator, int denominator, String expected) {
        assertThat(instance.fractionToDecimal(numerator, denominator)).isEqualTo(expected);
    }
}
