/*
  CodingBat Functional 1 - https://codingbat.com/java/Functional-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * noX - https://codingbat.com/prob/p105967
 * <p>
 * Remove all the 'x' in each string in the passed list
 */
public class NoX {
    /**
     * Stream the list, map each list to its "clean" version, collect the changes in
     * a new list. The string cleanup is delegated to {@linkplain NoX#clean(String)}
     * 
     * @param strings a list
     * @return the clean list
     */
    public static List<String> solution(List<String> strings) {
        return strings.stream().map(NoX::clean).collect(Collectors.toList());
    }

    /**
     * Replace each string in the passed list with its "clean" version. The string
     * cleanup is delegated to {@linkplain NoX#clean(String)}
     *
     * @param strings a list
     * @return no x in any string
     */
    public static List<String> inPlace(List<String> strings) {
        strings.replaceAll(NoX::clean);
        return strings;
    }

    /**
     * Remove all the 'x' from the passed string
     *
     * @param s a string
     * @return the clean string
     */
    static String clean(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != 'x') {
                result.append(c);
            }
        }
        return result.toString();
    }
}
