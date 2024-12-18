/*
 * 1475. Final Prices With a Special Discount in a Shop - https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Subtract to each element the first next element not greater than it, if
 * available.
 * <p>
 * Constraint: the array is not empty
 */
public class FinalPricesWithASpecialDiscountInAShop {
    /**
     * Brute force
     * 
     * @param prices the input array
     * @return the input array after changes
     */
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }

        return prices;
    }
}
