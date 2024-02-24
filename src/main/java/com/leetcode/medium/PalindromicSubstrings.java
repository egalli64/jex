/*
 * 647. Palindromic Substrings - https://leetcode.com/problems/palindromic-substrings/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

public class PalindromicSubstrings {
    /**
     * Look for palindromes in a string
     * 
     * @param s a string
     * @return how many palindromes are in the input string
     */
    public int countSubstrings(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result += oddPalindromes(s, i);
            result += evenPalindromes(s, i);
        }

        return result;
    }

    private int oddPalindromes(String s, int origin) {
        return origin == 0 || origin == s.length() - 1 ? 1 : palindromes(s, origin, origin);
    }

    private int evenPalindromes(String s, int origin) {
        return origin == s.length() - 1 ? 0 : palindromes(s, origin, origin + 1);
    }

    private int palindromes(String s, int left, int right) {
        int count = 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count += 1;
            left -= 1;
            right += 1;
        }

        return count;
    }
}
