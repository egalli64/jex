/*
 * Prepare > Algorithms > Search > Sherlock and Array
 * https://www.hackerrank.com/challenges/sherlock-and-array/
 *
 * Given a non-empty array of integers
 * return YES if there is an element splitting the array in two parts having the same sum, NO otherwise
 */
package hr.algorithms.search;

import java.util.List;

public class SherlockAndArray {
    public static String balancedSums(List<Integer> arr) {
        long left = 0;
        long right = 0;

        for (int i = 1; i < arr.size(); i++) {
            right += arr.get(i);
        }
        if (left == right) {
            return "YES";
        }

        for (int i = 0; i < arr.size() - 1; i++) {
            left += arr.get(i);
            right -= arr.get(i + 1);

            if (left == right) {
                return "YES";
            }
        }
        int last = arr.get(arr.size() - 1);
        return left + last == 0 ? "YES" : "NO";
    }
}
