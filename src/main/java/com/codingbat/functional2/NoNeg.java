/*
  CodingBat Functional 2 - https://codingbat.com/java/Functional-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * noNeg - https://codingbat.com/prob/p103456
 * <p>
 * Filter out the negative numbers from the passed list
 */
public class NoNeg {
    /**
     * Stream the list, filter to keep the non-negative values, collect them in a
     * new list
     *
     * @param nums a list
     * @return the filtered list
     */
    public static List<Integer> solution(List<Integer> nums) {
        return nums.stream().filter(x -> x >= 0).collect(Collectors.toList());
    }

    /**
     * Remove the negative values from the passed list
     * 
     * @param nums a list
     * @return the filtered list
     */
    public static List<Integer> inPlace(List<Integer> nums) {
        nums.removeIf(x -> x < 0);
        return nums;
    }
}
