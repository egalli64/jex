/*
  CodingBat String 3 - https://codingbat.com/java/String-3

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.string3;

/**
 * notReplace - https://codingbat.com/prob/p154137
 * <p>
 * Generate a new string from the passed one, when each occurrence of "is" is
 * replaced by "is not". Before/after "is" there should _not_ be a letter, see
 * {@linkplain Character#isLetter(char)}
 */
public class NotReplace {
    /**
     * Loop on all chars. Append each char in the builder that is going to be
     * returned. If the current char is an 'i' and it is not the last char, check if
     * it is followed by an 's'. If so, append the 's' and, if "is" is a word,
     * append " not" in the builder. Since an extra char has been checked (the 's'),
     * an extra loop variable increase is required.
     * 
     * @param str a string
     * @return "not" string
     */
    public static String solution(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            result.append(cur);
            if (cur == 'i' && i < str.length() - 1 && str.charAt(i + 1) == 's') {
                result.append('s');
                boolean left = i == 0 || !Character.isLetter(str.charAt(i - 1));
                boolean right = i == str.length() - 2 || !Character.isLetter(str.charAt(i + 2));
                if (left && right) {
                    result.append(" not");
                }
                i += 1;
            }
        }

        return result.toString();
    }

    /**
     * Convert the passed string to a mutable one. Loop on the (mutable) string
     * until an instance of "is" is found. If it is a word, insert a " not" after
     * it. Since there is no use in looking for the next "is" just after it (or
     * "not", if inserted) the loop variable could be increased by 2, for "is", and
     * by 4 too, for " not".
     * 
     * @param str a string
     * @return "not" string
     */
    public static String byInsert(String str) {
        StringBuilder result = new StringBuilder(str);

        int i = -1;
        while ((i = result.indexOf("is", i + 1)) != -1) {
            boolean left = i == 0 || !Character.isLetter(result.charAt(i - 1));
            boolean right = i == result.length() - 2 || !Character.isLetter(result.charAt(i + 2));
            if (left && right) {
                result.insert(i + 2, " not");
                i += 4;
            }
            i += 2;
        }

        return result.toString();
    }

    /**
     * Replace all the "is" word (with \b is specified a word boundary) regular
     * expressions with "is not"
     * 
     * @param str a string
     * @return "not" string
     */
    public static String matching(String str) {
        return str.replaceAll("\\bis\\b", "is not");
    }
}
