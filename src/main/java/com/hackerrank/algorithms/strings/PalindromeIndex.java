/*
 * Prepare > Algorithms > String > Palindrome Index
 * https://www.hackerrank.com/challenges/palindrome-index/
 * <p>
 * Given a non-empty string of chars in [a-z]
 * return the index of a char that, when removed, makes it a palindrome
 * or -1 of already a palindrome
  */
package com.hackerrank.algorithms.strings;

public class PalindromeIndex {
    public static int palindromeIndex(String s) {
        int left = 0;
        int right = s.length() - 1;
        for (; left < right; left++, right--) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
        }

        if (left < right) {
            for (int i = left + 1, j = right; i <= j; ++i, --j) {
                if (s.charAt(i) != s.charAt(j)) {
                    return right;
                }
            }
            return left;
        } else {
            return -1;
        }
    }
}
