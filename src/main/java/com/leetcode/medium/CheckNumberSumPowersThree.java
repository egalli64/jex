/*
 * 1780. Check if Number is a Sum of Powers of Three - https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Check if the passed integer is a sum of _distinct_ powers of 3
 * <p>
 * Constraint: natural integer as input (1+)
 */
public class CheckNumberSumPowersThree {
    /**
     * Try to convert the number in base 3 representation BUT only using 0 and 1
     * (can't have two times the same power)
     * 
     * @param n the input number
     * @return
     */
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            } else {
                n /= 3;
            }
        }
        return true;
    }
}
