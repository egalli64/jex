/*
  CodingBat Functional 1 - https://codingbat.com/java/Functional-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * rightDigit - https://codingbat.com/prob/p152194
 * <p>
 * Convert each integer in the passed list to its rightmost decimal digit
 */
public class RightDigit {
    /**
     * Stream the input list, map each element to its modulo 10, collect the
     * resulting list
     *
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> solution(List<Integer> nums) {
        return nums.stream().map(x -> x % 10).collect(Collectors.toList());
    }

    /**
     * Stream the input list, map each element to its modulo 10, collect the
     * resulting list
     *
     * @param nums a list
     * @return the changed list
     * @apiNote Using Stream::toList, a version 16 feature
     */
    public static List<Integer> modern(List<Integer> nums) {
        return nums.stream().map(x -> x % 10).toList();
    }

    /**
     * Replace each value in the input list with its modulo 10
     *
     * @param nums a list
     * @return the changed list
     */
    public static List<Integer> inPlace(List<Integer> nums) {
        nums.replaceAll(x -> x % 10);
        return nums;
    }
}
