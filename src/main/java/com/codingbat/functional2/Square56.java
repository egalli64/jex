/*
  CodingBat Functional 2 - https://codingbat.com/java/Functional-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * square56 - https://codingbat.com/prob/p132748
 * <p>
 * Square each integer in the input list, add ten to each one, but drop any
 * element that, after appending, ends by 5 or 6 (base 10)
 */
public class Square56 {
    /**
     * Stream the input list, map each value as specified, filter to keep just the
     * required values, collect them to a new list
     * 
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> solution(List<Integer> nums) {
        return nums.stream().map(x -> x * x + 10).filter(x -> {
            int last = x % 10;
            return last < 5 || last > 6;
        }).collect(Collectors.toList());
    }

    /**
     * Drop from the passed list the numbers having as last digit 4, 5, or 6 (since
     * their last digit, when squared, is 5 or 6), do not consider the number sign,
     * since, for example, -4 modulo 10 is 6. Then apply the required transformation
     * 
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> inPlace(List<Integer> nums) {
        nums.removeIf(x -> {
            int last = Math.abs(x) % 10;
            return last >= 4 && last <= 6;
        });
        nums.replaceAll(x -> x * x + 10);
        return nums;
    }
}
