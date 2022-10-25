/*
 * Prepare > Algorithms > Bit Manipulation > Lonely Integer
 * https://www.hackerrank.com/challenges/lonely-integer/
 *
 * Given a list of integers, all couples and a single element
 * Return the single
 */
package hr.algorithms.bit;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LonelyInteger {
    public static int lonelyInteger(List<Integer> a) {
        Set<Integer> buffer = new HashSet<>();
        for (Integer cur : a) {
            if (buffer.contains(cur)) {
                buffer.remove(cur);
            } else {
                buffer.add(cur);
            }
        }
        return buffer.iterator().next();
    }

    public static int lonelyIntegerXor(List<Integer> a) {
        return a.stream().reduce(0, (x, cur) -> x ^ cur);
    }
}
