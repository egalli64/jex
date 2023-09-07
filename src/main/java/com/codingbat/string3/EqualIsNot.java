/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * equalIsNot - https://codingbat.com/prob/p141736
 * <p>
 * Check if the passed string contains the same number of "is" and "not"
 */
public class EqualIsNot {
    /**
     * Loop two times on the passed string to count by
     * {@linkplain String#indexOf(String, int)} how many instances of the two tags
     * are in it. Then compare them.
     * 
     * @param str a string
     * @return true if number "is" == number "not"
     */
    public static boolean solution(String str) {
        String[] tags = { "is", "not" };
        int[] counters = { 0, 0 };

        for (int i = 0; i < tags.length; i++) {
            int pos = -1;
            while ((pos = str.indexOf(tags[i], pos + 1)) != -1) {
                counters[i] += 1;
            }
        }

        return counters[0] == counters[1];
    }

    /**
     * Keep track of "is" and "not" count in an accumulator. If input string is
     * sized 2+, check if it ends with "is". Otherwise, if it is sized 3+, check if
     * it has, from the third last on, "not" in it. Then loop, up to the fourth
     * last, looking for both targets.
     * 
     * @param str a string
     * @return true if number "is" == number "not"
     */
    public static boolean verbose(String str) {
        int delta = 0;

        if (str.length() >= 2 && str.charAt(str.length() - 2) == 'i' && str.charAt(str.length() - 1) == 's') {
            delta += 1;
        } else if (str.length() >= 3) {
            if (str.charAt(str.length() - 3) == 'i' && str.charAt(str.length() - 2) == 's') {
                delta += 1;
            } else if (str.charAt(str.length() - 3) == 'n' && str.charAt(str.length() - 2) == 'o'
                    && str.charAt(str.length() - 1) == 't') {
                delta -= 1;
            }
        }

        for (int i = 0; i < str.length() - 3; i++) {
            char cur = str.charAt(i);
            char next = str.charAt(i + 1);
            if (cur == 'i' && next == 's') {
                delta += 1;
                i += 1;
            } else if (cur == 'n' && next == 'o' && str.charAt(i + 2) == 't') {
                delta -= 1;
                i += 2;
            }
        }

        return delta == 0;
    }

    /**
     * Create a matcher on the passed string for "is" and another for "not". Count
     * the found matching on both and check if they are equal.
     * 
     * @param str a string
     * @return true if number "is" == number "not"
     */
    public static boolean matching(String str) {
        int delta = 0;

        Matcher is = Pattern.compile("is").matcher(str);
        while (is.find()) {
            delta += 1;
        }

        Matcher not = Pattern.compile("not").matcher(str);
        while (not.find()) {
            delta -= 1;
        }

        return delta == 0;
    }

    /**
     * Java 9 is (currently) not supported by CodingBat
     * <p>
     * Count the results matching the passed string for the compiled pattern "is",
     * and then "not". Then compare them.
     * 
     * @param str a string
     * @return true if number "is" == number "not"
     */
    public static boolean unsupported(String str) {
        long is = Pattern.compile("is").matcher(str).results().count();
        long not = Pattern.compile("not").matcher(str).results().count();
        return is == not;
    }
}
