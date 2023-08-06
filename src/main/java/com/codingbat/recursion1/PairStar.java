/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * pairStar - https://codingbat.com/prob/p158175
 * <p>
 * Generate recursively a new string having interleaving '*' between each couple
 * of identical characters
 */
public class PairStar {
    /**
     * Base case: if the string has less than two chars in it, return it unchanged
     * <p>
     * Recursive part: return the first char, concatenated to a '*' if the second
     * char is identical, then the result of recursion on a copy of the original
     * string from its second char on
     *
     * @param str a string
     * @return the string with '*' added as char connector
     */
    public static String pairStar(String str) {
        if (str.length() < 2) {
            return str;
        }

        String intro = str.substring(0, 1);
        if (str.charAt(0) == str.charAt(1)) {
            intro += "*";
        }

        return intro + pairStar(str.substring(1));
    }

    /**
     * Inception for {@linkplain PairStar#alternative(StringBuilder, int)}
     * <p>
     * Convert the passed string in a string builder, start checking it from
     * position 1
     *
     * @param str a string
     * @return all same-char couple connected by '*'
     */
    public static String alternative(String str) {
        return str.length() < 2 ? str : alternative(new StringBuilder(str), 1).toString();
    }

    /**
     * Recursive helper for {@linkplain PairStar#alternative(String)}
     * <p>
     * Base case: when the index is out of bound, return the builder unchanged
     * <p>
     * Recursive part: insert a '*' in i position if the previous char is identical,
     * then recurse increasing i
     *
     * @param sb a mutable string
     * @param i  current position to be checked for '*' insertion
     * @return the starred string
     */
    static StringBuilder alternative(StringBuilder sb, int i) {
        if (i == sb.length()) {
            return sb;
        }
        if (sb.charAt(i) == sb.charAt(i - 1)) {
            sb.insert(i, '*');
        }
        return alternative(sb, i + 1);
    }
}
