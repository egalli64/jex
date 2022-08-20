/*
 * Prepare > Algorithms > Sorting > Closest Numbers
 * https://www.hackerrank.com/challenges/closest-numbers/
 * <p>
 * Given a list sized 2+
 * Return a list containing all the pairs having the lowest distance
 */
package hr.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

public class ClosestNumbers {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        arr.sort(null);

        List<Integer> result = new ArrayList<>();
        int first = arr.get(0);
        int second = arr.get(1);
        int distance = second - first;
        result.add(first);
        result.add(second);

        for (int i = 2; i < arr.size(); i++) {
            first = second;
            second = arr.get(i);
            int gap = second - first;
            if (gap < distance) {
                distance = gap;
                result.clear();
            }
            if (gap == distance) {
                result.add(first);
                result.add(second);
            }
        }

        return result;
    }
}
