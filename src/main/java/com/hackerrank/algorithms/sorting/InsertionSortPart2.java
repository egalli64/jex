/**
 * Prepare > Algorithms > Sorting > Insertion Sort - Part 2
 * https://www.hackerrank.com/challenges/insertionsort2/
 * <p>
 * Apply the insertion sort algorithm to the passed List
 * Print to console the status after each step
 */
package com.hackerrank.algorithms.sorting;

import java.util.Collections;
import java.util.List;

public class InsertionSortPart2 {
    public static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                Integer current = arr.get(j);
                Integer previous = arr.get(j - 1);
                if (current < previous) {
                    Collections.swap(arr, j, j - 1);
                }
            }
            dump(arr);
        }
    }

    private static void dump(List<Integer> data) {
        System.out.print(data.get(0));
        for (int i = 1; i < data.size(); i++) {
            System.out.print(" " + data.get(i));
        }
        System.out.println();
    }
}
