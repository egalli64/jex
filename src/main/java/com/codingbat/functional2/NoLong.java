/*
  CodingBat Functional 2 - https://codingbat.com/java/Functional-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * noLong - https://codingbat.com/prob/p194496
 * <p>
 * Filter out from the passed list the strings sized 4 or more
 */
public class NoLong {
    /**
     * Stream the passed list, filter to keep the required elements, collect them to
     * a new list
     * 
     * @param strings a list
     * @return the filtered list
     */
    public static List<String> solution(List<String> strings) {
        return strings.stream().filter(x -> x.length() < 4).collect(Collectors.toList());
    }

    /**
     * Remove the non-required elements from the input list
     *
     * @param strings a list
     * @return the filtered list
     */
    public static List<String> inPlace(List<String> strings) {
        strings.removeIf(x -> x.length() >= 4);
        return strings;
    }

    /**
     * Stream the input list, filter to keep just the required elements, collect
     * them in a new list
     *
     * @param strings a list
     * @return the filtered list
     * @apiNote requires 16+ for Stream::toList
     */
    public static List<String> compactModern(List<String> strings) {
        return strings.stream().filter(NoLong::isShort).toList();
    }

    /**
     * Implementation detail to simplify caller code
     * 
     * @param s a string
     * @return true if the passed string is short enough
     */
    private static boolean isShort(String s) {
        return s.length() < 4;
    }
}
