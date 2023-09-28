/*
  CodingBat Functional 1 - https://codingbat.com/java/Functional-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * lower - https://codingbat.com/prob/p186894
 * <p>
 * Convert each string in the passed list to lowercase version
 */
public class Lower {
    /**
     * Stream the passed list, map each element to its lowercase version, collect
     * them in a new list
     * 
     * @param strings a list
     * @return the changed list
     */
    public static List<String> solution(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    /**
     * Stream the passed list, map each element to its lowercase version, collect
     * them in a new list
     * 
     * @param strings a list
     * @return the changed list
     * @apiNote Using Stream::toList, a version 16 feature
     */
    public static List<String> modern(List<String> strings) {
        return strings.stream().map(String::toLowerCase).toList();
    }

    /**
     * Replace each string in the passed list to its lowercase version
     *
     * @param strings a list
     * @return the changed list
     */
    public static List<String> inPlace(List<String> strings) {
        strings.replaceAll(String::toLowerCase);
        return strings;
    }
}
