/**
 * https://codingbat.com/java/Functional-2
 */
package com.codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {
    /**
     * codingbat.com/prob/p115967
     *
     * @param strings a string list
     * @return each string has a "y" added at the end, but strings containing "yy"
     *         are discarded
     */
    public static List<String> noYY(List<String> strings) {
        return strings.stream().map(x -> x + "y").filter(x -> !x.contains("yy")).collect(Collectors.toList());
    }

    /**
     * codingbat.com/prob/p194496
     *
     * @param strings a list
     * @return no string with length 4+ allowed
     */
    public static List<String> noLong(List<String> strings) {
        strings.removeIf(x -> x.length() > 3);
        return strings;
    }

    /**
     * codingbat.com/prob/p184496
     *
     * @param strings a list
     * @return no string sized 3 or 4 allowed
     */
    public static List<String> no34(List<String> strings) {
        strings.removeIf(x -> {
            final int size = x.length();
            return size > 2 && size < 5;
        });
        return strings;
    }

    /**
     * codingbat.com/prob/p148198
     *
     * @param nums non-negatives
     * @return doubled, but discarded if in base-10 it ends by 2
     */
    public static List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(x -> x * 2).filter(x -> x % 10 != 2).collect(Collectors.toList());
    }

    /**
     * codingbat.com/prob/p132748
     *
     * @param nums a list
     * @return squared plus 10, discard if ends in 5 or 6 (base 10)
     */
    public static List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(x -> x * x + 10).filter(x -> {
            int last = x % 10;
            return last < 5 || last > 6;
        }).collect(Collectors.toList());
    }
}
