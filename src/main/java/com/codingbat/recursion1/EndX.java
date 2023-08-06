/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * endX - https://codingbat.com/prob/p105722
 * <p>
 * Generate recursively a string having where all '*' have been moved to the end
 */
public class EndX {
    /**
     * Base case: empty string has no 'x' in it
     * <p>
     * Recursive part: recurse dropping the first char. If it is an 'x', concatenate
     * it after recursion, otherwise before
     *
     * @param str a string
     * @return all 'x' moved to the end
     */
    public static String endX(String str) {
        if (str.isEmpty()) {
            return str;
        }

        char cur = str.charAt(0);
        if (cur == 'x') {
            return endX(str.substring(1)) + cur;
        } else {
            return cur + endX(str.substring(1));
        }
    }
}
