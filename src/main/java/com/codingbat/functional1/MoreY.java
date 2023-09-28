/*
  CodingBat Functional 1 - https://codingbat.com/java/Functional-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * moreY - https://codingbat.com/prob/p177528
 * <p>
 * Each string in the passe list should be prefixed and postfixed with an 'y'
 */
public class MoreY {
    /**
     * Stream the input list, map its elements to the changed string, as required,
     * collect the results in a new list
     *
     * @param strings a list
     * @return the changed list
     */
    public static List<String> solution(List<String> strings) {
        return strings.stream().map(s -> "y" + s + "y").collect(Collectors.toList());
    }

    /**
     * Stream the input list, map its elements to the changed string, as required,
     * collect the results in a new list
     *
     * @param strings a string list
     * @return changed list
     * @apiNote Stream::toList requires Java 16
     */
    public static List<String> modern(List<String> strings) {
        return strings.stream().map(s -> "y" + s + "y").toList();
    }

    /**
     * Replace each string in the passed list with the required one
     *
     * @param strings a list
     * @return the changed list
     */
    public static List<String> inPlace(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }
}
