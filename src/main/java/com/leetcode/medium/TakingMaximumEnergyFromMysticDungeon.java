/*
 * 3147. Taking Maximum Energy From the Mystic Dungeon - https://leetcode.com/problems/taking-maximum-energy-from-the-mystic-dungeon/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Pick elements, in [-1000 ... 1000], from the input array.
 * Start wherever you want, step by k (positive).
 * Return the largest sum you can get.
 */
public class TakingMaximumEnergyFromMysticDungeon {
    public int maximumEnergy(int[] energy, int k) {
        int result = energy[energy.length - 1];

        for (int i = energy.length - 1; i >= energy.length - k; i--) {
            int candidate = 0;
            for (int j = i; j >= 0; j -= k) {
                candidate += energy[j];
                result = Math.max(result, candidate);
            }
        }

        return result;
    }
}
