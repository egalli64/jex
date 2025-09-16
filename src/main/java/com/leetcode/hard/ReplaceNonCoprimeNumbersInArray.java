/*
 * 2197. Replace Non-Coprime Numbers in Array - https://leetcode.com/problems/replace-non-coprime-numbers-in-array/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Replace adjacent co-prime numbers with their Least Common Multiple
 */
public class ReplaceNonCoprimeNumbersInArray {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> result = new ArrayList<>(nums.length);

        for (int current : nums) {
            while (!result.isEmpty()) {
                int left = result.getLast();
                int gcd = gcd(left, current);
                if (gcd == 1) {
                    break;
                } else {
                    result.removeLast();
                    // gcd(a,b) * lcm(a,b) = a * b -> lcm(a,b) = a * b / gcd(a,b)
                    current = current * (left / gcd);
                }
            }
            result.add(current);
        }

        return result;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
