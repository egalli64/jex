/**
 * https://codingbat.com/java/Functional-1
 */
package com.codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {
    /**
     * codingbat.com/prob/p181634
     * <p>
     * Java 11 not supported by CodingBat, see
     * {@linkplain Functional1#copies3(List)}
     *
     * @param strings a string list
     * @return each string tripled
     */
    public static List<String> copies3Java11(List<String> strings) {
        strings.replaceAll(x -> x.repeat(3));
        return strings;
    }

    /**
     * codingbat.com/prob/p181634
     *
     * @param strings a string list
     * @return each string tripled
     */
    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(x -> x + x + x);
        return strings;
    }

    /**
     * codingbat.com/prob/p152194
     *
     * @param nums a int list of non-negative numbers
     * @return for each number just the rightmost decimal cipher is kept
     */
    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(x -> x % 10);
        return nums;
    }

    /**
     * Variation to {@linkplain Functional1#rightDigit(List)}, new list is generated
     * and returned
     *
     * @param nums a int list of non-negative numbers
     * @return for each number just the rightmost decimal cipher is kept
     */
    public static List<Integer> rightDigitOther(List<Integer> nums) {
        return nums.stream().map(x -> x % 10).collect(Collectors.toList());
    }

    /**
     * codingbat.com/prob/p177528
     *
     * @param strings a list
     * @return each string prefixed and postfixed by 'y'
     */
    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(x -> 'y' + x + 'y');
        return strings;
    }

    /**
     * codingbat.com/prob/p103869
     *
     * @param nums a list
     * @return each element is increased and multiplied by 10
     */
    public static List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(x -> (x + 1) * 10);
        return nums;
    }

    /**
     * codingbat.com/prob/p186894
     *
     * @param strings a list
     * @return each string is lowercase
     */
    public static List<String> lower(List<String> strings) {
        strings.replaceAll(String::toLowerCase);
        return strings;
    }

    /**
     * codingbat.com/prob/p105967
     *
     * @param strings a list
     * @return no x in any string
     */
    public static List<String> noX(List<String> strings) {
        strings.replaceAll(Functional1::noX);
        return strings;
    }

    /**
     * Helper for {@linkplain Functional1#noX(List)}
     *
     * @param s a string
     * @return no 'x' in it
     */
    private static String noX(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != 'x') {
                result.append(c);
            }
        }
        return result.toString();
    }
}
