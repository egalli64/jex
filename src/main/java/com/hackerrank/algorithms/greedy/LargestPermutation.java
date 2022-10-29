/*
 * Prepare > Algorithms > Greedy > Largest Permutation
 * https://www.hackerrank.com/challenges/largest-permutation/
 *
 * Given
 *  the number of maximum possible swap
 *  and a shuffle of the series of natural numbers
 * Return the list changed so that it is ordered in descending order, for what it is possible
 */
package com.hackerrank.algorithms.greedy;

import java.util.Collections;
import java.util.List;

public class LargestPermutation {
    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1 && k > 0; i++) {
            Integer cur = arr.get(i);
            if (cur < arr.size() - i) {
                int j = indexOf(arr, i + 1, arr.size() - i);
                Collections.swap(arr, i, j);
                k -= 1;
            }
        }

        return arr;
    }

    private static int indexOf(List<Integer> arr, int pos, int value) {
        for (int i = pos; i < arr.size(); i++) {
            if (arr.get(i) == value) {
                return i;
            }
        }
        throw new IllegalStateException();
    }
}
