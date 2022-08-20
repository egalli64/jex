/**
 * Prepare > Algorithms > Sorting > Counting Sort 1
 * https://www.hackerrank.com/challenges/countingsort1/
 * <p>
 * The input list contains values in [0..99]
 * Return their frequency as a list sized 100
 */
package hr.algorithms.sorting;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] result = new int[100];

        for (int cur : arr) {
            result[cur] += 1;
        }

        // Java 16 currently not supported by HackerRank
        // return IntStream.of(result).boxed().toList();
        return IntStream.of(result).boxed().collect(Collectors.toList());
    }
}
