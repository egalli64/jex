/*
 * 1652. Defuse the Bomb - https://leetcode.com/problems/defuse-the-bomb/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given an array, convert each element with the sum of the next k elements. If
 * k is negative, use the previous elements.
 */
public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        int change = Integer.signum(k);
        k = Math.abs(k);

        for (int i = 0; i < code.length; i++) {
            for (int j = 1; j <= k; j++) {
                int pos = (i + change * j) % code.length;
                if (pos < 0) {
                    pos = code.length + pos;
                }
                result[i] += code[pos];
            }
        }

        return result;
    }
}
