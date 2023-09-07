/*
  CodingBat Functional 2 - https://codingbat.com/java/Functional-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * no9 - https://codingbat.com/prob/p124510
 * <p>
 * Filter out from the passed list the numbers ending by 9 (base 10)
 */
public class No9 {
    /**
     * Stream the input list, filter to keep only the required values, collect them
     * in a new list
     * 
     * @param nums a list
     * @return filtered list
     */
    public static List<Integer> solution(List<Integer> nums) {
        return nums.stream().filter(x -> x % 10 != 9).collect(Collectors.toList());
    }

    /**
     * Remove from the passed list the non required items
     *
     * @param nums a list
     * @return filtered list
     */
    public static List<Integer> inPlace(List<Integer> nums) {
        nums.removeIf(x -> x % 10 == 9);
        return nums;
    }
}
