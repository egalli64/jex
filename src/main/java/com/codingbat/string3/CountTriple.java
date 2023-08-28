/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

/**
 * countTriple - https://codingbat.com/prob/p195714
 * <p>
 * Count how many (possibly overlapping) same char triplet are in the string
 */
public class CountTriple {
    /**
     * Loop on all the triplets, increasing the counter each time an "all same" is
     * found.
     *
     * @param str a string
     * @return triplet count
     */
    public static int solution(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                counter += 1;
            }
        }

        return counter;
    }
}
