/*
  CodingBat Java Warmup 2 - https://codingbat.com/java/Warmup-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup2;

/**
 * doubleX - https://codingbat.com/prob/p186759
 * <p>
 * Check if the first 'x' is immediately followed by another 'x'
 */
public class DoubleX {
    /**
     * Using String::indexOf()
     *
     * @param str a possibly empty string
     * @return true if the first 'x' in it is immediately followed by another 'x'
     */
    public static boolean solution(String str) {
        int x = str.indexOf('x');
        return x >= 0 && x < str.length() - 1 && str.charAt(x + 1) == 'x';
    }

    /**
     * Solution "by hand"
     *
     * @param str a possibly empty string
     * @return true if the first 'x' in it is immediately followed by another 'x'
     */
    public static boolean verbose(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                return str.charAt(i + 1) == 'x';
            }
        }

        return false;
    }
}
