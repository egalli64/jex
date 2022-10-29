/*
 * Prepare > Algorithms > Greedy > Maximum Perimeter Triangle
 * https://www.hackerrank.com/challenges/maximum-perimeter-triangle/
 *
 * Given a list of 3+ integers representing side lengths
 *  peak three of them to form a non-degenerated triangle
 * Choose the one having
 * - the maximum perimeter
 * - the longest maximum side
 * - the longest minimum side
 *
 * Return the three sides in non-decreasing order, or -1
 */
package com.hackerrank.algorithms.greedy;

import java.util.Arrays;
import java.util.List;

public class MaximumPerimeterTriangle {
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        sticks.sort(null);
        int k = sticks.size() - 1;
        int j = k - 1;
        int i = j - 1;

        List<Integer> result = Arrays.asList(sticks.get(i), sticks.get(j), sticks.get(k));
        while (true) {
            if (result.get(0) + result.get(1) > result.get(2)) {
                return result;
            }
            if (k > j + 1) {
                k -= 1;
                result.set(2, sticks.get(k));
            } else if (j > i + 1) {
                j -= 1;
                result.set(1, sticks.get(j));
            } else if (i > 0) {
                i -= 1;
                result.set(0, sticks.get(i));
            } else {
                return List.of(-1);
            }
        }
    }
}
