/*
 * Prepare > Algorithms > Sorting > Find the Median
 * https://www.hackerrank.com/challenges/find-the-median/
 * <p>
 * Given a list odd sized
 * Return its median value
 */
package hr.algorithms.sorting;

import java.util.List;

public class FindTheMedian {
    public static int findMedian(List<Integer> arr) {
        arr.sort(null);
        return arr.get(arr.size() / 2);
    }
}
