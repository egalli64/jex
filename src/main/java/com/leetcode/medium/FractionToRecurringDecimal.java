/*
 * 166. Fraction to Recurring Decimal - https://leetcode.com/problems/fraction-to-recurring-decimal/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Divide the input numerator and denominator and convert it to a string.
 * The decimal part, if present should be cut if there is a repeating part.
 * The eventual repetition should be shown in parentheses
 * Beware of Integer.MIN_VALUE!
 */
public class FractionToRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        if (numerator < 0 != denominator < 0) {
            result.append("-");
        }

        long dividend = Math.abs(Long.valueOf(numerator));
        long divisor = Math.abs(Long.valueOf(denominator));
        result.append(dividend / divisor);

        long remainder = dividend % divisor;
        if (remainder != 0) {
            result.append(".");
            Map<Long, Integer> map = new HashMap<>();
            while (remainder != 0) {
                if (map.containsKey(remainder)) {
                    result.insert(map.get(remainder), "(");
                    result.append(")");
                    break;
                }

                map.put(remainder, result.length());
                remainder *= 10;
                result.append(remainder / divisor);
                remainder %= divisor;
            }
        }

        return result.toString();
    }
}
