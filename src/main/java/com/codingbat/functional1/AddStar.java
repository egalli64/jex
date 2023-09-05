/*
  CodingBat Functional 1 - https://codingbat.com/java/Functional-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * addStar - https://codingbat.com/prob/p170181
 * <p>
 * Add an '*' at the end of each string in the passed list
 */
public class AddStar {
    /**
     * Stream the passed list, map it to a new stream with changed values, collect
     * the results to a new list
     *
     * @param nums a list
     * @return the changed list
     */
    public static List<String> solution(List<String> nums) {
        return nums.stream().map(x -> x + "*").collect(Collectors.toList());
    }

    /**
     * Stream the passed list, map it to a new stream with changed values, collect
     * the results to a new list
     *
     * @param nums a list
     * @return the changed list
     * @apiNote Stream::toList() is a Java 16 feature
     */
    public static List<String> modern(List<String> nums) {
        return nums.stream().map(x -> x + "*").toList();
    }

    /**
     * Replace all the values in the passed list with the required concatenation
     *
     * @param nums a list
     * @return the changed list
     */
    public static List<String> inPlace(List<String> strings) {
        strings.replaceAll(x -> x + '*');
        return strings;
    }
}
