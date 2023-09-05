/*
  CodingBat Functional 1 - https://codingbat.com/java/Functional-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * copies3 - https://codingbat.com/prob/p181634
 * <p>
 * Each string in the passe list should be "multiplied" by 3
 */
public class Copies3 {
    /**
     * Stream the input list, map it applying the required change, collect in a new
     * list
     *
     * @param strings a string list
     * @return changed list
     */
    public static List<String> solution(List<String> strings) {
        return strings.stream().map(s -> s + s + s).collect(Collectors.toList());
    }

    /**
     * Stream the input list, map it applying the required change, collect to a new
     * list
     *
     * @param strings a string list
     * @return changed list
     * @apiNote String::repeat requires Java 11
     * @apiNote Stream::toList requires Java 16
     */
    public static List<String> modern(List<String> strings) {
        return strings.stream().map(s -> s.repeat(3)).toList();
    }

    /**
     * Replace all the values in the passed list with the required concatenation
     *
     * @param strings a string list
     * @return changed list
     */
    public static List<String> inPlace(List<String> strings) {
        strings.replaceAll(x -> x + x + x);
        return strings;
    }
}
