/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * countXX - https://codingbat.com/prob/p194667
 * <p>
 * Count the possibly overlapping "xx" in the passed string
 */
public class CountXX {
    /**
     * 
     * 
     * @param str a string
     * @return number of "xx"
     */
    public static int solution(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                count += 1;
            }
        }

        return count;
    }
}
