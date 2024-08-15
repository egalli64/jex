/*
 * 860. Lemonade Change - https://leetcode.com/problems/lemonade-change/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given that
 * <ul>
 * <li>You are selling one lemonade to each customer for 5 currency unit
 * <li>There are three different bills: 5, 10, 20
 * <li>An array of customer, each one want a lemonade and has a bill to pay
 * <li>Each customer should be given the right change
 * <li>No change available at first (the first customer must pay 5)
 * 
 * Return true if you can provide every customer with the correct change, or
 * false otherwise
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        // track 5, 10 currently available - 20 are not of interest
        int[] changes = new int[2];

        for (int bill : bills) {
            switch (bill) {
            case 5 -> changes[0] += 1;
            case 10 -> {
                if (changes[0] > 0) {
                    changes[0] -= 1;
                    changes[1] += 1;
                } else {
                    return false;
                }
            }
            case 20 -> {
                if (changes[0] > 0 && changes[1] > 0) {
                    changes[0] -= 1;
                    changes[1] -= 1;
                } else if (changes[0] > 2) {
                    changes[0] -= 3;
                } else {
                    return false;
                }
            }
            default -> throw new IllegalArgumentException();
            }
        }
        return true;
    }
}
