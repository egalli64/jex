/*
  CodingBat Functional 1 - https://codingbat.com/java/Functional-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional1;

import java.util.List;

/**
 * doubling - https://codingbat.com/prob/p117665
 * <p>
 * Set each value in the passed list to its double
 */
public class Doubling {
    /**
     * Stream the passed list, map it to a new stream with doubled values, collect
     * the results to a new list
     * 
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> solution(List<Integer> nums) {
        return nums.stream().map(x -> x * 2).toList();
    }

    /**
     * Replace all the values in the passed list with their double
     *
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> inPlace(List<Integer> nums) {
        nums.replaceAll(x -> x * 2);
        return nums;
    }
}
