/*
  CodingBat Functional 2 - https://codingbat.com/java/Functional-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * noYY - https://codingbat.com/prob/p115967
 * <p>
 * Change each string in the input list, appending a 'y' at their end, but drop
 * any string having a "yy" anywhere (after appending)
 */
public class NoYY {
    /**
     * Stream the passed list, filter to keep the required elements, map them as
     * required, collect the result to a new list
     *
     * @param strings a string list
     * @return the changed list
     */
    public static List<String> solution(List<String> strings) {
        return strings.stream().filter(s -> !s.contains("yy") && !s.endsWith("y")).map(s -> s + "y")
                .collect(Collectors.toList());
    }

    /**
     * Remove from the passed list the non-complying elements, adjust the surviving
     * ones as required before returning the list
     *
     * @param strings a list
     * @return the filtered list
     */
    public static List<String> inPlace(List<String> strings) {
        strings.removeIf(s -> s.contains("yy") || s.endsWith("y"));
        strings.replaceAll(s -> s + "y");
        return strings;
    }

    /**
     * Stream the passed list, filter to keep the required elements, map them as
     * required, collect the result to a new list
     *
     * @param strings a list
     * @return the filtered list
     * @apiNote requires 16+ for Stream::toList
     */
    public static List<String> compactModern(List<String> strings) {
        return strings.stream().filter(NoYY::isGood).map(s -> s + "y").toList();
    }

    /**
     * Implementation detail to simplify caller code
     * 
     * @param s a string
     * @return true if the passed string should be kept
     */
    private static boolean isGood(String s) {
        return !s.contains("yy") && !s.endsWith("y");
    }
}
