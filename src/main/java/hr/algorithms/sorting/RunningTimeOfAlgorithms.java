/**
 * Prepare > Algorithms > Sorting > Running Time of Algorithms
 * https://www.hackerrank.com/challenges/runningtime/
 * <p>
 * Run insertion sort on the passed list
 * Return the number of shifts required to sort it
 */
package hr.algorithms.sorting;

import java.util.Collections;
import java.util.List;

public class RunningTimeOfAlgorithms {
    public static int runningTime(List<Integer> arr) {
        int count = 0;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i; j > 0; j--) {
                Integer current = arr.get(j);
                Integer previous = arr.get(j - 1);
                if (current < previous) {
                    Collections.swap(arr, j, j - 1);
                    count += 1;
                }
            }
        }
        return count;
    }
}
