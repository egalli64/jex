/*
 * 869. Reordered Power of 2 - https://leetcode.com/problems/reordered-power-of-2/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer in [1 ... 10^9], check if it is a power of 2,
 * in its original form, or reordering its (decimal) digits
 */
public class ReorderedPowerOf2 {
    private final static Set<String> targets;

    static {
        targets = new HashSet<>();
        for (int i = 1; i <= 1_000_000_000; i *= 2) {
            targets.add(digitFrequency(i));
        }
    }

    static private String digitFrequency(int x) {
        int[] digits = new int[10];
        while (x > 0) {
            digits[x % 10] += 1;
            x /= 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        return sb.toString();
    }

    public boolean reorderedPowerOf2(int n) {
        String key = digitFrequency(n);
        return targets.contains(key);
    }
}
