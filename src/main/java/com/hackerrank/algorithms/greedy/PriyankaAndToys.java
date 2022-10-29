/*
 * Prepare > Algorithms > Greedy > Priyanka and Toys
 * https://www.hackerrank.com/challenges/priyanka-and-toys/
 *
 * Given a non-empty list of non-negative integers
 * Group them so that for each group max - min < 5
 * Return the minimal number of groups
 */
package com.hackerrank.algorithms.greedy;

import java.util.List;

public class PriyankaAndToys {
    public static int toys(List<Integer> w) {
        w.sort(null);

        int count = 1;
        int max = w.get(0) + 4;
        for (Integer cur : w) {
            if (cur > max) {
                count += 1;
                max = cur + 4;
            }
        }

        return count;
    }
}
