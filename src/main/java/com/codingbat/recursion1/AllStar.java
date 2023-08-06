/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * allStar - https://codingbat.com/prob/p183394
 * <p>
 * Generate recursively a new string having interleaving '*' between each couple
 * of characters
 */
public class AllStar {
    /**
     * Base case: if the string has less than two chars in it, return it unchanged
     * <p>
     * Recursive part: return the first char, a '*' then the result of recursion on
     * a copy of the original string from its second char on
     *
     * @param str a string
     * @return the string with '*' added as char connector
     */
    public static String allStar(String str) {
        if (str.length() < 2) {
            return str;
        }

        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    /**
     * Inception for {@linkplain AllStar#alternative(StringBuilder, int)}. If the
     * string is sized less than 2, return it unchanged. Otherwise convert the
     * string in a string builder, and pass it to the associated recursive method
     * along with the index of where the first '*' has to be placed.
     *
     * @param str a string
     * @return the string with '*' added as char connector
     */
    public static String alternative(String str) {
        if (str.length() < 2) {
            return str;
        }
        return alternative(new StringBuilder(str), 1).toString();
    }

    /**
     * Recursive support for {@linkplain AllStar#allStar(String)}
     * <p>
     * Base case: if the position is out of bound, return the string builder
     * unchanged
     * <p>
     * Recursive part: insert a '*' in the passed position, recurse adding 2 to the
     * position
     *
     * @param sb  a mutable string
     * @param pos current position for '*' insertion
     * @return the starred string
     */
    static StringBuilder alternative(StringBuilder sb, int pos) {
        if (pos >= sb.length()) {
            return sb;
        }

        sb.insert(pos, '*');
        return alternative(sb, pos + 2);
    }
}
