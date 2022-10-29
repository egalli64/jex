/*
 * Practice - Interview Preparation Kit - Sorting - Mark and Toys
 * Practice - Algorithms - Greedy - Mark and Toys
 *
 * https://www.hackerrank.com/challenges/mark-and-toys/problem
 */
package com.hackerrank.sorting;

import java.util.List;

public class MarkToy {

    /**
     * @param prices a list of prices
     * @param total the total amount we could spend
     * @return the maximum number of elements (no duplicates) we can buy
     */
    public static int maximumToys(List<Integer> prices, int total) {
        if(prices == null || prices.size() == 0) {
            return 0;
        }

        prices.sort(null);
        int count = 0;

        for(Integer price : prices) {
            if(price > total) {
                break;
            }
            total -= price;
            count += 1;
        }

        return count;
    }
}
