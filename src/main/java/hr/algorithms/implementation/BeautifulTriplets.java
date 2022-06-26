/*
    Prepare > Algorithms > Implementation > Beautiful Triplets
    https://www.hackerrank.com/challenges/beautiful-triplets

    Count 2 element groups with max number of or-ed value
 */
package hr.algorithms.implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeautifulTriplets {
    public static int beautifulTriplets(int d, List<Integer> arr) {
        int counter = 0;

        Map<Integer, Integer> buffer = new HashMap<>();
        for (Integer current : arr) {
            Integer first = buffer.get(current - 2 * d);
            Integer second = buffer.get(current - d);
            if (first != null && second != null) {
                counter += first * second;
            }

            Integer previous = buffer.putIfAbsent(current, 1);
            if (previous != null) {
                buffer.put(current, previous + 1);
            }
        }

        return counter;
    }
}
