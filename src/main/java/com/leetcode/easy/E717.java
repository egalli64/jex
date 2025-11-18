/*
 * 717. 1-bit and 2-bit Characters
 * https://leetcode.com/problems/1-bit-and-2-bit-characters/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * The input array represents a bit stream.
 * It is not-empty, and it has a zero in the last position.
 * The only valid bit configuration in the stream are 0, 10, and 11.
 * Check if the final 0 must be alone or could be of a '10' subsequence.
 */
class E717 {
    /**
     * Smoke Test
     */
    static void main() {
        E717 x = new E717();

        System.out.println(x.isOneBitCharacter(new int[]{1, 0, 0}));
        System.out.println(!x.isOneBitCharacter(new int[]{1, 1, 1, 0}));
    }

    public boolean isOneBitCharacter(int[] bits) {
        int count = 0;

        for (int i = bits.length - 2; i >= 0 && bits[i] == 1; i--) {
            count += 1;
        }

        return count % 2 == 0;
    }
}
