/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * last2 - https://codingbat.com/prob/p178318
 * <p>
 * Get how many times the substring with the last two chars are _repeated_ in it
 */
public class Last2 {
    /**
     * If the string has less than 3 chars, there could be no repetition. Use
     * String::indexOf() to get all other previous instances.
     *
     * @param str a possibly empty string
     * @return how many times the last two chars are repeated in str
     */
    public static int solution(String str) {
        if (str.length() < 3) {
            return 0;
        }

        final int end = str.length() - 2;
        String tag = str.substring(end);
        int count = 0;
        int pos = -1;
        while ((pos = str.indexOf(tag, pos + 1)) < end) {
            count += 1;
        }
        return count;
    }
}
