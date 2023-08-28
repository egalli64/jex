/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * countCode - https://codingbat.com/prob/p123614
 * <p>
 * Count the occurrences of "co.e" in the passed string
 */
public class CountCode {
    /**
     * Check all 4-char substrings in the passed string looking for the required
     * pattern
     *
     * @param str a string
     * @return the counter
     */
    public static int solution(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count += 1;
                i += 3;
            }
        }

        return count;
    }

    /**
     * Use {@linkplain String#indexOf(String, int)} in a loop, until there is room
     * for the target
     *
     * @param str a string
     * @return the counter
     */
    public static int byIndexOf(String str) {
        int count = 0;

        int pos = -1;
        while ((pos = str.indexOf("co", pos + 1)) != -1 && pos < str.length() - 3) {
            if (str.charAt(pos + 3) == 'e') {
                count += 1;
                pos += 3;
            } else {
                pos += 1;
            }
        }

        return count;
    }

    /**
     * Create a matcher on the input string for the pattern "co.e". Find all its
     * occurrences, keeping track of them in a counter.
     * 
     * @param str a string
     * @return the counter
     */
    public static int matching(String str) {
        int count = 0;

        Matcher code = Pattern.compile("co.e").matcher(str);
        while (code.find()) {
            count += 1;
        }

        return count;
    }

    /**
     * The use of {@linkplain Matcher#results()} is (currently) not supported in
     * CodingBat - Java 9 feature.
     * 
     * @param str a string
     * @return the counter
     */
    public static int unsupportedModernMatch(String str) {
        return (int) Pattern.compile("co.e").matcher(str).results().count();
    }
}
