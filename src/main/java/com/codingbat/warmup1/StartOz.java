/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

/**
 * startOz - codingbat.com/prob/p199720
 * <p>
 * Check for 'o' and 'z' in the first two positions and return them (or it)
 */
public class StartOz {
    /**
     * Beware of out of bound exception
     * 
     * @param str a possibly empty string
     * @return "o", "z", or "oz"
     */
    public static String solution(String str) {
        StringBuilder result = new StringBuilder();
        if (str.length() > 0 && str.charAt(0) == 'o') {
            result.append('o');
        }
        if (str.length() > 1 && str.charAt(1) == 'z') {
            result.append('z');
        }

        return result.toString();
    }
}
