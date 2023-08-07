/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * countHi2 - https://codingbat.com/prob/p143900
 * <p>
 * Count recursively the number of "hi" not following by an 'x'
 */
public class CountHi2 {
    /**
     * Base case: a string shorter than 2 has no 'hi' in it
     * <p>
     * Recursive part: if the first two chars in the string are 'h', 'i', recurse
     * discarding the first two chars and adding 1 to the result. If the first two
     * chars are 'x', 'h', discard the first two chars in recursion. Otherwise
     * discard a single char in recursion.
     *
     * @param str a string
     * @return count of "hi" not prefixed by 'x'
     */
    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        char first = str.charAt(0);
        char second = str.charAt(1);
        if (first == 'h' && second == 'i') {
            return 1 + countHi2(str.substring(2));
        } else if (first == 'x' && second == 'h') {
            return countHi2(str.substring(2));
        } else {
            return countHi2(str.substring(1));
        }
    }

    /**
     * Delegate {@linkplain CountHi2#tailRec(String, int, int)} for tail recursion
     *
     * @param str a string
     * @return count of "hi" not prefixed by 'x'
     */
    public static int tailRec(String str) {
        return tailRec(str, 0, 0);
    }

    /**
     * Tail recursion for {@linkplain CountHi2#tailRec(String)}
     *
     * @param s   a string
     * @param i   current index
     * @param acc counter accumulator
     * @return count of "hi" not prefixed by 'x'
     */
    private static int tailRec(String s, int i, int acc) {
        if (i > s.length() - 2) {
            return acc;
        }
        if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'i') {
            return tailRec(s, i + 2, acc + 1);
        } else if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'h') {
            return tailRec(s, i + 2, acc);
        } else {
            return tailRec(s, i + 1, acc);
        }
    }
}
