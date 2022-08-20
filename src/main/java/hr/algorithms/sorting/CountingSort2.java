/**
 * Prepare > Algorithms > Sorting > Counting Sort 2
 * https://www.hackerrank.com/challenges/countingsort2/
 * <p>
 * The input list contains values in [0..99]
 * Return the array sorted by counting
 */
package hr.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

public class CountingSort2 {
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] buffer = new int[100];

        for (int cur : arr) {
            buffer[cur] += 1;
        }

        List<Integer> result = new ArrayList<>(arr.size());
        for(int i = 0; i < buffer.length; i++) {
            for(int j = 0; j < buffer[i]; j++) {
                result.add(i);
            }
        }

        return result;
    }
}
