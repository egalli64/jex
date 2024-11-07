/*
 * 2275. Largest Combination With Bitwise AND Greater Than Zero - https://leetcode.com/problems/largest-combination-with-bitwise-and-greater-than-zero/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given an array of positive integers, evaluate the bitwise AND of every
 * combination of its elements. Each element may only be used once in each
 * combination.
 * <p>
 * Return the size of the largest combination of elements with a bitwise AND
 * greater than 0.
 * <p>
 * Constraints: The candidates are 24 bits long
 */
public class LargestCombinationWithBitwiseAndGreaterThanZero {
    public int largestCombination(int[] candidates) {
        int largest = 0;
        for (int candidate : candidates) {
            if (candidate > largest) {
                largest = candidate;
            }
        }

        int result = 0;

        for (int i = 1; i <= largest; i <<= 1) {
            int counter = 0;
            for (int candidate : candidates) {
                if ((candidate & i) != 0) {
                    counter += 1;
                }
            }
            result = Math.max(result, counter);
        }

        return result;
    }
}
