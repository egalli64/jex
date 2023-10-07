/*
  CodingBat Functional 2 - https://codingbat.com/java/Functional-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * no34 - https://codingbat.com/prob/p184496
 * <p>
 * Filter out from the passed list the strings sized 3 or 4
 */
public class No34 {
    /**
     * Stream the passed list, filter to keep the required elements, collect them to
     * a new list
     * 
     * @param strings a list
     * @return the filtered list
     */
    public static List<String> solution(List<String> strings) {
        return strings.stream().filter(s -> s.length() < 3 || s.length() > 4).collect(Collectors.toList());
    }

    /**
     * Remove from the passed list the non-required elements
     *
     * @param strings a list
     * @return the filtered list
     */
    public static List<String> inPlace(List<String> strings) {
        strings.removeIf(s -> s.length() == 3 || s.length() == 4);
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
        return strings.stream().filter(No34::isGood).toList();
    }

    /**
     * Implementation detail to simplify caller code
     * 
     * @param s a string
     * @return true if the passed string is short enough
     */
    private static boolean isGood(String s) {
        return s.length() < 3 || s.length() > 4;
    }
}
