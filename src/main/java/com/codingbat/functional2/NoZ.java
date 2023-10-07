/*
  CodingBat Functional 2 - https://codingbat.com/java/Functional-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * noZ - https://codingbat.com/prob/p105671
 * <p>
 * Filter out from the passed list the strings having at least a 'z' in it
 */
public class NoZ {
    /**
     * Stream the input list, filter to keep just the required elements, collect
     * them in a new list
     *
     * @param strings a list
     * @return the filtered list
     */
    public static List<String> solution(List<String> strings) {
        return strings.stream().filter(s -> !s.contains("z")).collect(Collectors.toList());
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
        return strings.stream().filter(NoZ::noZ).toList();
    }

    /**
     * Implementation detail to simplify caller code
     * 
     * @param s a string
     * @return true if the passed string does not contain any 'z'
     */
    static boolean noZ(String s) {
        return !s.matches(".*z.*");
    }

    /**
     * Remove from the passed list the non required elements
     * 
     * @param strings a list
     * @return the filtered list
     */
    public static List<String> inPlace(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }
}
