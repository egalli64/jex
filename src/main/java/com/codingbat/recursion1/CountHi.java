/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * countHi - https://codingbat.com/prob/p184029
 * <p>
 * Count recursively the number of "hi" in the passed string
 */
public class CountHi {
    /**
     * Base case: a string shorter than 2 has no 'hi' in it
     * <p>
     * Recursive part: check if the first two chars in the string are 'h' and 'i',
     * then recurse on the rest of the string (next char, if 'hi' not found, skip an
     * extra char otherwise)
     *
     * @param str a string
     * @return number of "hi" in it
     */
    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }

        int hi = str.charAt(0) == 'h' && str.charAt(1) == 'i' ? 1 : 0;
        return hi + countHi(str.substring(1 + hi));
    }

    /**
     * Base case: if there is no 'hi' in the string, there is nothing more to do
     * <p>
     * Recursive part: if the target has been found, return 1 plus the result of
     * calling recursively on the substring after the target
     * <p>
     * Even tough we don't see it in the code, the call to String::indexOf implies a
     * loop (so, this is kind of cheating)
     *
     * @param str a string
     * @return number of "hi" in it
     */
    public static int cheat(String str) {
        int pos = str.indexOf("hi");
        if (pos == -1) {
            return 0;
        }

        return 1 + cheat(str.substring(pos + 2));
    }
}
