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
     * their last digit, when squared, is 5 or 6).
     * <p>
     * To get the last digit use Math::floorMod (Java 8+) or Math::abs to work
     * correctly on negative values. In Java the operator % returns the _remainder_,
     * keeping the original sign. Here we need the "real" modulo, an unsigned value.
     * <p>
     * Then apply the required transformation
     * 
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> inPlace(List<Integer> nums) {
        nums.removeIf(x -> {
            int last = Math.floorMod(x, 10);
            return last >= 4 && last <= 6;
        });
        nums.replaceAll(x -> x * x + 10);
        return nums;
    }

    /**
     * Stream the passed list, filter to keep the required elements, map them as
     * required, collect the result to a new list
     *
     * @param nums a list
     * @return the filtered list
     * @apiNote requires 16+ for Stream::toList
     */
    public static List<Integer> compactModern(List<Integer> nums) {
        return nums.stream().filter(Square56::isGood).map(x -> x * x + 10).toList();
    }

    /**
     * Implementation detail to simplify caller code
     * <p>
     * Do not accept a value having as last digit 4, 5, or 6 (base 10) since its
     * squared value ends by 5 or 6
     * <p>
     * To get the last digit use Math::floorMod (Java 8+) or Math::abs to work
     * correctly on negative values. In Java the operator % returns the _remainder_,
     * keeping the original sign. Here we need the "real" modulo, an unsigned value.
     * 
     * @param x an integer
     * @return true if the passed integer should be kept
     */
    private static boolean isGood(int x) {
        int last = Math.floorMod(x, 10);
        return last < 4 || last > 6;
    }
}
