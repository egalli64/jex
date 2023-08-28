/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

/**
 * gHappy - https://codingbat.com/prob/p198664
 * <p>
 * Check if all the 'g' in the input string are near another 'g'
 */
public class GHappy {
    /**
     * Check all the triples in the input string, if the central char is a 'g' and
     * both previous and following chars are _not_ a 'g', the condition is not met.
     * Check also the single-char string, that should _not_ be "g" and, if the
     * string is sized 2+ and the last char is 'g', the previous one should _not_ be
     * a 'g'.
     *
     * @param str a string
     * @return true if accepted
     */
    public static boolean solution(String str) {
        if (str.length() == 1 && str.charAt(0) != 'g') {
            return false;
        } else if (str.length() >= 2 && str.charAt(str.length() - 2) != 'g' && str.charAt(str.length() - 1) == 'g') {
            return false;
        }

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
                return false;
            }
        }

        return true;
    }

    /**
     * The input string should not match: a single 'g', a final 'g' preceded by a
     * non-'g', a triplet with a 'g' in the middle of non-'g'.
     * 
     * @param str a string
     * @return true if accepted
     */
    public static boolean match(String str) {
        return !str.matches("g|.*[^g]g|.*[^g]g[^g].*");
    }
}
