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
     * codingbat.com/prob/
     *
     * @param strings a string list
     * @return the changed list
     */
    public static List<String> solution(List<String> strings) {
        return strings.stream().filter(s -> !s.contains("yy") && !s.endsWith("y")).map(s -> s + "y")
                .collect(Collectors.toList());
    }

    public static List<String> inPlace(List<String> strings) {
        strings.removeIf(s -> s.contains("yy") || s.endsWith("y"));
        strings.replaceAll(s -> s + "y");
        return strings;
    }
}
