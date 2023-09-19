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

    /**
     * Inception for {@linkplain EndX#tailRec(String, int, int, StringBuilder)}
     * <p>
     * Generate the solution in the passed builder
     *
     * @param str a string
     * @return all 'x' moved to the end
     */
    public static String tailRec(String str) {
        if (str.isEmpty()) {
            return str;
        }

        return tailRec(str, 0, 0, new StringBuilder());
    }

    /**
     * Base case: input is consumed, return the accumulator as string
     * <p>
     * Recursive part: check the current input char, if 'x' append it to the end of
     * the accumulator, otherwise insert it in the current builder position
     * 
     * @param s   the input string
     * @param i   current position in input
     * @param j   current position in output
     * @param acc the accumulator for result
     * @return the resulting string
     */
    static String tailRec(String s, int i, int j, StringBuilder acc) {
        if (i == s.length()) {
            return acc.toString();
        }

        char cur = s.charAt(i);
        if (cur == 'x') {
            acc.append(cur);
        } else {
            acc.insert(j, cur);
            j += 1;
        }

        return tailRec(s, i + 1, j, acc);
    }
}
