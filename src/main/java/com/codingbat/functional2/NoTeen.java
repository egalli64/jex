/*
  CodingBat Functional 2 - https://codingbat.com/java/Functional-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * noTeen - https://codingbat.com/prob/p137274
 * <p>
 * Filter out from the passed list the numbers in range [13 .. 19]
 */
public class NoTeen {
    /**
     * Stream the input list, filter to keep the required values, collect them to a
     * new list
     *
     * @param nums a list
     * @return the filtered list
     */
    public static List<Integer> solution(List<Integer> nums) {
        return nums.stream().filter(x -> x < 13 || x > 19).collect(Collectors.toList());
    }

    /**
     * Remove from the passed list the non-required values
     *
     * @param nums a list
     * @return the filtered list
     */
    public static List<Integer> inPlace(List<Integer> nums) {
        nums.removeIf(x -> x >= 13 && x <= 19);
        return nums;
    }
}
