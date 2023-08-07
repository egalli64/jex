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
    public static int countX(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        int count = str.charAt(0) == 'x' ? 1 : 0;
        return count + countX(str.substring(1));
    }

    /**
     * Delegate to {@linkplain CountX#tailRec(String, int, int)}
     *
     * @param str a string
     * @return the number of 'x' in it
     */
    public static int tailRec(String str) {
        return tailRec(str, 0, 0);
    }

    /**
     * Tail recursion for {@linkplain CountX#tailRec(String)}
     * <p>
     * Base case: on the end of the string return the accumulator
     * <p>
     * Recursive part: if the current char is an 'x' increase the accumulator,
     * recurse increasing the index
     *
     * @param str a string
     * @param i   the current position
     * @return the number of 'x' from here on
     */
    static int tailRec(String str, int i, int acc) {
        if (i == str.length()) {
            return acc;
        }

        if (str.charAt(i) == 'x') {
            acc += 1;
        }
        return tailRec(str, i + 1, acc);
    }
}
