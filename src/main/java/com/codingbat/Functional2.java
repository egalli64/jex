/**
 * https://codingbat.com/java/Functional-2
 */
package com.codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {
    /**
     * codingbat.com/prob/p132748
     *
     * @param nums a list
     * @return squared plus 10, discard if ends in 5 or 6 (base 10)
     */
    public static List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(x -> x * x + 10).filter(x -> {
            int last = x % 10;
            return last < 5 || last > 6;
        }).collect(Collectors.toList());
    }
}
