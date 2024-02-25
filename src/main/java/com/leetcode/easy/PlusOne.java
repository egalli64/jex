/*
 * 66. Plus One - https://leetcode.com/problems/plus-one/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given the array representation of a number, where each element is an integer
 * digit. The digits are ordered from most significant to least significant in
 * left-to-right order. Increment the large integer by one and return the
 * resulting array of digits.
 * 
 * Constraints: the array is non-empty, each digit is in [0..9], no leading 0
 */
public class PlusOne {
    /**
     * Increase the passed value
     * 
     * @param digits the array representation of a (big) integer
     * @return the array representation of the increased value
     */
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }

        if (carry == 0) {
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        }
    }
}
