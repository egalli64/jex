/*
 * 2410. Maximum Matching of Players With Trainers - https://leetcode.com/problems/maximum-matching-of-players-with-trainers/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.Arrays;

/**
 * Count the max matching between the given players and trainers.
 * Each selected player value (ability) should be not greater than the paired trainer.
 */
public class MaximumMatchingOfPlayersWithTrainers {
    /**
     * Sort the players and trainers by ability.
     * Loop on them.
     * If the current pair is a match, good,
     * otherwise try the current player against the next trainer.
     *
     * @param players  players abilities
     * @param trainers trainers abilities
     * @return found pairs
     */
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int result = 0;

        for (int i = 0, j = 0; i < players.length && j < trainers.length; ) {
            if (players[i] <= trainers[j]) {
                result += 1;
                i += 1;
            }
            j += 1;
        }

        return result;
    }
}
