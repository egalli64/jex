/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * getSandwich - https://codingbat.com/prob/p129952
 * <p>
 * Extract from the passed string the substring delimited by the first and last
 * appearance of "bread", or an empty string
 */
public class GetSandwich {
    /**
     * Get the starting index of the first and last occurrence of "bread", then
     * generate the substring delimited by them
     *
     * @param str a string
     * @return the extracted substring
     */
    public static String solution(String str) {
        final int first = str.indexOf("bread");
        final int last = str.lastIndexOf("bread");
        return first == last ? "" : str.substring(first + 5, last);
    }
}
