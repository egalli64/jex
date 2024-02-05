/*
 * LeetCode 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

public class PalindromeNumber {
    /**
     * Check if the passed integer is a palindrome (base 10)
     * 
     * <ul>
     * <li>A negative number is never a palindrome (for the minus sign)
     * <li>A single digit number is a palindrome
     * <li>A multiple of 10 is not a palindrome (for the ending 0)
     * <li>Split the number in two in a mirror way and compare them
     * 
     * @param x an integer
     * @return true if it is a palindrome
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }

        int rightHalf = 0;
        while (x > rightHalf) {
            rightHalf = rightHalf * 10 + x % 10;
            x /= 10;
        }

        return x == rightHalf || x == rightHalf / 10;
    }
}
