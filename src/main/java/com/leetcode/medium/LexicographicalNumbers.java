/*
 * 386. Lexicographical Numbers - https://leetcode.com/problems/lexicographical-numbers/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate a list containing the integers [1 .. n] in lexicographical order
 */
public class LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>(n);

        int current = 1;

        for (int i = 0; i < n; i++) {
            result.add(current);

            if (current * 10 <= n) {
                current *= 10;
            } else {
                while (current % 10 == 9 || current >= n) {
                    current /= 10;
                }
                current += 1;
            }
        }

        return result;
    }
}
