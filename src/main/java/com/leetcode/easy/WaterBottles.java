/*
 * 1518. Water Bottles - https://leetcode.com/problems/water-bottles/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given a number of water bottles full of water, and knowing that you can
 * exchange empty water bottles from the market with one full water bottle,
 * return the maximum number of water bottles you can drink.
 * 
 * Constraints: bottles in 1..100, exchanges in 2..100
 */
public class WaterBottles {
    /**
     * Following the provided design, loop until empty bottles could be exchanged
     * with new ones.
     * 
     * @param numBottles  the initial number of full bottles
     * @param numExchange number of empty bottles required for a full one
     * @return total number of emptied bottles
     */
    public int numWaterBottles(int numBottles, int numExchange) {
        final int delta = numExchange - 1;
        int result = numBottles;

        while (numBottles >= numExchange) {
            result += 1;
            numBottles -= delta;
        }

        return result;
    }

    /**
     * The plain solution could be improved noticing that each "delta" lot of
     * bottles gives a free bottle. So we can get rid of the loop.
     * 
     * @param numBottles  the initial number of full bottles
     * @param numExchange number of empty bottles required for a full one
     * @return total number of emptied bottles
     */
    public int faster(int numBottles, int numExchange) {
        final int delta = numExchange - 1;
        return numBottles + (numBottles - 1) / delta;
    }
}
