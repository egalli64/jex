/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

/**
 * withoutString - https://codingbat.com/prob/p192570
 * <p>
 * Remove all the case-insensitive instances of the "remove" string from "base".
 * Do not check for overlapping remove.
 */
public class WithoutString {
    /**
     * Loop on all the base chars, stopping so the last index would let check
     * against the remove string. Compare, case insensitive, the current piece of
     * base with remove, if match, skip it over. Otherwise put the current char in
     * builder, and go to the next char. Finally append to the builder the last part
     * of the base not checked against remove.
     * 
     * @param base   a string
     * @param remove a string to be removed
     * @return a copy of base without any remove (case-insensitive!) in it
     */
    public static String solution(String base, String remove) {
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < base.length() - remove.length() + 1) {
            if (base.substring(i, i + remove.length()).compareToIgnoreCase(remove) == 0) {
                i += remove.length();
            } else {
                result.append(base.charAt(i));
                i += 1;
            }
        }
        result.append(base.substring(i));

        return result.toString();
    }

    /**
     * Simple pattern matching by {@linkplain String#replaceAll(String, String)}.
     * Replace all case insensitive instances of remove string with an empty string.
     *
     * @param base   a string
     * @param remove a string to be removed
     * @return a copy of base without any remove (case-insensitive!) in it
     */
    public static String byPattern(String base, String remove) {
        return base.replaceAll("(?i)" + remove, "");
    }
}
