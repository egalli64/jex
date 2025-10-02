/*
 * 3100. Water Bottles II - https://leetcode.com/problems/water-bottles-ii/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * You get nb full bottles.
 * You can exchange nx empty bottles for a full bottle.
 * But any exchange increase the number of empty bottles required the next time.
 * Calculate the max number of bottles you can drink.
 */
public class WaterBottlesII {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int result = numBottles;

        int empty = numBottles;
        while (empty >= numExchange) {
            empty -= numExchange - 1;
            result += 1;
            numExchange += 1;
        }

        return result;
    }
}
