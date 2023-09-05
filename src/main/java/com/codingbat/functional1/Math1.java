/*
  CodingBat Functional 1 - https://codingbat.com/java/Functional-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * math1 - https://codingbat.com/prob/p103869
 * <p>
 * Add one and multiply the result by 10 to each integer in the passed list
 */
public class Math1 {
    /**
     * Stream the input list, map its elements to the changed values as required,
     * collect the results in a new list
     *
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> solution(List<Integer> nums) {
        return nums.stream().map(x -> (x + 1) * 10).collect(Collectors.toList());
    }

    /**
     * Each value in the input list is replaced with the new required value
     *
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> inPlace(List<Integer> nums) {
        nums.replaceAll(x -> (x + 1) * 10);
        return nums;
    }
}
