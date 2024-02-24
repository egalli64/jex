/*
 * 412. Fizz Buzz - https://leetcode.com/problems/fizz-buzz/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * The classic FizzBuzz problem
 */
public class FizzBuzz {
    /**
     * Generate a String List sized n for values in [1..n] converted to string, or
     * Fizz (3*), Buzz (5*), or FizzBuzz (3* and 5*)
     * 
     * @param n a non-negative integer
     * @return list of fizz/buzz
     */
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                result.add(Integer.toString(i));
            } else {
                StringBuilder current = new StringBuilder();
                if (i % 3 == 0) {
                    current.append("Fizz");
                }
                if (i % 5 == 0) {
                    current.append("Buzz");
                }
                result.add(current.toString());
            }
        }
        return result;
    }
}
