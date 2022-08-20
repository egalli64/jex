/*
 * Prepare > Algorithms > Sorting > Quicksort 1 - Partition
 * https://www.hackerrank.com/challenges/quicksort1/
 * <p>
 * Partition the passed list using its first element as pivot
 * The list is non-empty and contains no duplicated values
 * Return the partitioned list
 */
package hr.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

public class Quicksort1Partition {
    public static List<Integer> quickSort(List<Integer> arr) {
        Integer pivot = arr.get(0);

        List<Integer> result = new ArrayList<>(arr);
        int left = 0;
        int right = arr.size() - 1;
        for (int i = 1; i < arr.size(); i++) {
            Integer current = arr.get(i);
            result.set(current < pivot ? left++ : right--, current);
        }

        // no duplicated values!
        result.set(left, pivot);

        return result;
    }
}
