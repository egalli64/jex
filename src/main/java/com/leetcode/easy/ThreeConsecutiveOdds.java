/*
 * 1550. Three Consecutive Odds - https://leetcode.com/problems/three-consecutive-odds/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a non-empty int array, return true if there are three consecutive odd
 * numbers in the array. Otherwise, return false.
 */
public class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            boolean good = true;
            for (int j = 0; good && j < 3; j++) {
                if (arr[i] % 2 == 1) {
                    i += 1;
                } else {
                    good = false;
                }
            }

            if (good) {
                return true;
            }
        }
        return false;
    }
}
