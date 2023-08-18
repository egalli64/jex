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
     * Use String::indexOf in a loop, until there is room for the target
     *
     * @param str a string
     * @return the counter
     */
    public static int solution(String str) {
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
     * Package java.util.regex is not (currently) supported in CodingBat
     * 
     * @param str a string
     * @return the counter
     */
    public static int unsupportedClassicMatch(String str) {
        int count = 0;

        Matcher code = Pattern.compile("(co.e)").matcher(str);
        while (code.find()) {
            count += 1;
        }

        return count;
    }

    /**
     * Neither java.util.regex nor Java 9 are (currently) supported in CodingBat
     * 
     * @param str a string
     * @return the counter
     */
    public static int unsupportedModernMatch(String str) {
        return (int) Pattern.compile("(co.e)").matcher(str).results().count();
    }
}
