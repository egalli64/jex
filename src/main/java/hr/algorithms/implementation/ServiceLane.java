/*
    Prepare > Algorithms > Implementation > Service Lane
    https://www.hackerrank.com/challenges/service-lane/problem

    Return local minimum in the width array for each passed "cases" interval
    Notice: there is (was?) an error in parameter list
        the first one, n, could be removed
        width has to be added
    Besides, beware that the example follows base-1 indexing convention
 */
package hr.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;

public class ServiceLane {
    public static List<Integer> serviceLane(List<List<Integer>> cases, List<Integer> width) {
        List<Integer> result = new ArrayList<>();
        for (List<Integer> interval : cases) {
            int minimum = width.get(interval.get(0));
            for (int i = interval.get(0) + 1; i <= interval.get(1); i++) {
                minimum = Math.min(minimum, width.get(i));
            }
            result.add(minimum);
        }

        return result;
    }
}
