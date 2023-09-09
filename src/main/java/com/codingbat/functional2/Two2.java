/*
  CodingBat Functional 2 - https://codingbat.com/java/Functional-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * two2 - https://codingbat.com/prob/p148198
 * <p>
 * Double each integer in the input list, but drop any element that, after
 * appending, ends by 2 (base 10)
 */
public class Two2 {
    /**
     * Stream the input list, map each value in its double, filter to discard the
     * not required values, collect them to a new list
     *
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> solution(List<Integer> nums) {
        return nums.stream().map(x -> x * 2).filter(x -> x % 10 != 2).collect(Collectors.toList());
    }

    /**
     * Remove from the passed list the values having as last decimal digit 1 or 6,
     * since doubling leads to 2, then double all the surviving elements
     * 
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> inPlace(List<Integer> nums) {
        nums.removeIf(x -> {
            int lastDigit = x % 10;
            return lastDigit == 1 || lastDigit == 6;
        });
        nums.replaceAll(x -> x * 2);
        return nums;
    }
}
