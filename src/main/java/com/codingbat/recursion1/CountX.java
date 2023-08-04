/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * countX - https://codingbat.com/prob/p170371
 * <p>
 * Count recursively the number of 'x' in the passed string
 */
public class CountX {
    /**
     * Base case: an empty string has no 'x' in it
     * <p>
     * Recursive part: check if the first char in the string is an 'x', accordingly
     * to that, add 1 or 0 to the recursion on the substring from the second char on
     * 
     * @param str a string
     * @return the number of 'x' in it
     */
    public static int solution(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        int count = str.charAt(0) == 'x' ? 1 : 0;
        return count + solution(str.substring(1));
    }

    /**
     * Inception for alternative approach, delegate the real job to
     * {@linkplain CountX#alternative(String, it)}
     *
     * @param str a string
     * @return the number of 'x' in it
     */
    public static int alterative(String str) {
        return str.isEmpty() ? 0 : alterative(str, 0);
    }

    /**
     * Recursive helper for {@linkplain CountX#alternative(String)}
     * <p>
     * Base case: empty string has no 'x' in it
     * <p>
     * Recursive part: check if the current char is an 'x', accordingly to that, add
     * 1 or 0 to the recursion increasing cur
     *
     * @param str a string
     * @param cur the current position
     * @return the number of 'x' from here on
     */
    static int alterative(String str, int cur) {
        if (cur == str.length()) {
            return 0;
        }

        int count = str.charAt(cur) == 'x' ? 1 : 0;
        return count + alterative(str, cur + 1);
    }
}
