/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * countPairs - https://codingbat.com/prob/p154048
 * <p>
 * Generate recursively a string having where all '*' have been moved to the end
 */
public class CountPairs {
    /**
     * Base case: a string shorter than 3 has no pair in it
     * <p>
     * Recursive part: check if the current element is part of a pair, Return the
     * result of recursing dropping the first char, adding one if a pair has been
     * detected.
     *
     * @param str a string
     * @return the number of same chars separated by one other char
     */
    public static int countPairs(String str) {
        if (str.length() < 3) {
            return 0;
        }

        int count = str.charAt(0) == str.charAt(2) ? 1 : 0;
        return count + countPairs(str.substring(1));
    }

    /**
     * Inception for recursion on {@linkplain CountPairs#alternative(String, int)}
     * <p>
     * Start checking for pairs starting on the first position
     *
     * @param str a string
     * @return the number of same chars separated by one other char
     */
    public static int alternative(String str) {
        return alternative(str, 0);
    }

    /**
     * Recursive helper for {@linkplain CountPairs#alternative(String)}
     * <p>
     * Base case: if the checking position is on the second-last element (or more to
     * the right), no pair could be found
     * <p>
     * Recursive part: recurse increasing the current index. If the current element
     * has the same value as the second next one, add 1 to the recursion result.
     *
     * @param str a string
     * @param i   starting position
     * @return the number of same chars separated by one other char
     */
    static int alternative(String str, int i) {
        if (i >= str.length() - 2) {
            return 0;
        }

        int count = str.charAt(i) == str.charAt(i + 2) ? 1 : 0;
        return count + alternative(str, i + 1);
    }

    /**
     * Inception for tail recursion on {@linkplain CountPairs#tailRec(String, int)}
     * <p>
     * Start checking for pairs starting on the first position
     *
     * @param str a string
     * @return the number of same chars separated by one other char
     */
    public static int tailRec(String str) {
        return tailRec(str, 0, 0);
    }

    /**
     * Tail recursive helper for {@linkplain CountPairs#alternative(String)}
     * <p>
     * Base case: if the checking position is on the second-last element (or more to
     * the right), no pair could be found
     * <p>
     * Recursive part: if a pair is detected on the current char, increase the
     * accumulator. Return the call on recursing for the next index.
     *
     * @param str a string
     * @param i   starting position
     * @return the number of same chars separated by one other char
     */
    static int tailRec(String str, int i, int acc) {
        if (i >= str.length() - 2) {
            return acc;
        }

        if (str.charAt(i) == str.charAt(i + 2)) {
            acc += 1;
        }
        return tailRec(str, i + 1, acc);
    }
}
