/*
 * Prepare > Algorithms > Greedy > Permuting Two Arrays
 * https://www.hackerrank.com/challenges/two-arrays/
 *
 * Given two same sized, non-empty lists, and a positive k
 * Check if it is possible to pair all elements in a way that each pair is not less than k
 */
package com.hackerrank.algorithms.greedy;

import java.util.Comparator;
import java.util.List;

public class PermutingTwoArrays {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        A.sort(null);
        B.sort(Comparator.reverseOrder());

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(i) < k) {
                return "NO";
            }
        }
        return "YES";
    }
}
