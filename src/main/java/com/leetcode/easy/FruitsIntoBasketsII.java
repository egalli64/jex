/*
 * 3477. Fruits Into Baskets II - https://leetcode.com/problems/fruits-into-baskets-ii/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * We are given two arrays, same size, non-empty
 * The first array represent fruits - index is type, value is quantity
 * The second array represent baskets - value is the capacity
 * - each basked could contain just one type of fruits
 * Each batch of fruit must be placed in the leftmost basket with capacity >= fruit quantity
 * <p>
 * Return the number of unplaced fruit batches
 */
public class FruitsIntoBasketsII {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int result = 0;

        for (int fruit : fruits) {
            boolean found = false;
            for (int i = 0; i < baskets.length; i++) {
                if (fruit <= baskets[i]) {
                    baskets[i] = 0;
                    found = true;
                    break;
                }
            }
            if (!found) {
                result += 1;
            }
        }

        return result;
    }
}
