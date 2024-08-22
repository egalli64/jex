/*
 * 476. Number Complement - https://leetcode.com/problems/number-complement/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given an integer, return its complement
 * <p>
 * Constraints: the passed value is positive
 */
public class NumberComplement {
    /**
     * <ol>
     * <li>Generate an all-one binary sequence with the same size of the input value
     * <li>EXOR the input with the generated mask
     * 
     * @param num input value
     * @return the input complement
     */
    public int findComplement(int num) {
        int exp = (int) (Math.log(num) / Math.log(2)) + 1;
        int ones = (1 << exp) - 1;

        return num ^ ones;
    }
}
