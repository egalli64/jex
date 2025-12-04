/*
 * 2211. Count Collisions on a Road
 * https://leetcode.com/problems/count-collisions-on-a-road/description/
 * LeetCode Medium Problems
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * The input string represents a number of cars in line.
 * They could be going left (L), right (R), or stay in position (S)
 * Count the total number of collisions.
 */
class M2211 {
    /**
     * Smoke Test
     */
    static void main() {
        M2211 x = new M2211();

        System.out.println(x.countCollisions("RLRSLL") == 5);
        System.out.println(x.countCollisions("LLRR") == 0);
    }

    /**
     * Don't care about first cars moving left, and last ones moving right.
     * Check the "central" cars, each non-S is about to collide
     */
    public int countCollisions(String directions) {
        int left = 0;
        while (left < directions.length() && directions.charAt(left) == 'L') {
            left += 1;
        }

        int right = directions.length() - 1;
        while (right >= left && directions.charAt(right) == 'R') {
            right -= 1;
        }

        int result = 0;
        for (int i = left; i <= right; i++) {
            if (directions.charAt(i) != 'S') {
                result += 1;
            }
        }
        return result;
    }
}
