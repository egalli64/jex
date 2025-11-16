/*
 * 1513. Number of Substrings With Only 1s
 * https://leetcode.com/problems/adding-spaces-to-a-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given a non-empty "binary" string (it contains only '0' and '1's),
 * return the number of substrings containing just 1s (modulo 10^9 + 7).
 */
public class NumberOfSubstringsWithOnly1s {
    static final int CUT = 1_000_000_007;

    static void main() {
        NumberOfSubstringsWithOnly1s x = new NumberOfSubstringsWithOnly1s();

        System.out.println(x.numSub("0110111") == 9);
        System.out.println(x.numSub("101") == 2);
        System.out.println(x.numSub("111111") == 21);
    }

    public int numSub(String s) {
        long total = 0;

        long current = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                total += (current * (current + 1)) / 2;
                current = 0;
            } else {
                current += 1;
            }
        }

        total += (current * (current + 1)) / 2;
        return (int) (total % CUT);
    }
}
