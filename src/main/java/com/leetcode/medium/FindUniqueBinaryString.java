/*
 * 1980. Find Unique Binary String - https://leetcode.com/problems/find-unique-binary-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of n 'binary' strings sized n, return a 'binary' string sized
 * n _not_ in the array
 * <p>
 * Constraints: n is in [1..16], no duplicate '0'/'1' strings are passed
 */
public class FindUniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> buffer = new HashSet<>();
        for (String num : nums) {
            buffer.add(Integer.parseInt(num, 2));
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!buffer.contains(i)) {
                String result = Integer.toBinaryString(i);
                return "0".repeat(nums.length - result.length()) + result;
            }
        }

        throw new IllegalStateException("Constraint violation");
    }
}
