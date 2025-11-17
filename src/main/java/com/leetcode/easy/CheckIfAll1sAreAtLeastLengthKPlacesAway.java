/*
 * 1437. Check If All 1's Are at Least Length K Places Away
 * https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a non-empty array of 0/1,
 * check if the 1s are at least separated by k 0s
 */
public class CheckIfAll1sAreAtLeastLengthKPlacesAway {
    /**
     * Smoke Test
     */
    static void main() {
        CheckIfAll1sAreAtLeastLengthKPlacesAway x = new CheckIfAll1sAreAtLeastLengthKPlacesAway();

        System.out.println(x.kLengthApart(new int[]{1, 0, 0, 0, 1, 0, 0, 1}, 2));
        System.out.println(!x.kLengthApart(new int[]{1, 0, 0, 1, 0, 1}, 2));
    }

    public boolean kLengthApart(int[] nums, int k) {
        int i = 0;

        while (i < nums.length && nums[i] != 1) {
            i += 1;
        }

        int onePos = i;
        i += 1;

        while (i < nums.length) {
            if (nums[i] == 1) {
                if (i - onePos <= k) {
                    return false;
                } else {
                    onePos = i;
                }
            }

            i += 1;
        }

        return true;
    }
}
