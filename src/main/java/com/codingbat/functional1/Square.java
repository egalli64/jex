/*
  CodingBat Functional 1 - https://codingbat.com/java/Functional-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * square - https://codingbat.com/prob/p139586
 * <p>
 * Set each value in the passed list to its square
 */
public class Square {
    /**
     * Stream the passed list, map it to a new stream with squared values, collect
     * the results to a new list
     *
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> solution(List<Integer> nums) {
        return nums.stream().map(x -> x * x).collect(Collectors.toList());
    }

    /**
     * Stream the passed list, map it to a new stream with squared values, collect
     * the results to a new list
     *
     * @param nums a list
     * @return the changed list
     * @apiNote Stream::toList() is a Java 16 feature
     */
    public static List<Integer> modern(List<Integer> nums) {
        return nums.stream().map(x -> x * x).toList();
    }

    /**
     * Replace all the values in the passed list with their square
     *
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> inPlace(List<Integer> nums) {
        nums.replaceAll(x -> x * x);
        return nums;
    }
}
