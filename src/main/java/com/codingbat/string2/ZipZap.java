/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

/**
 * zipZap - https://codingbat.com/prob/p180759
 * <p>
 * Generate a string from the passed one where each "z.p" is replaced with "zp"
 */
public class ZipZap {
    /**
     * Loop on the input string, append each char in a buffer, if the current char
     * is a 'z' in the specified pattern, append the 'p' too, and skip the central
     * char.
     *
     * @param str a string
     * @return the generated string
     */
    public static String solution(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            result.append(cur);

            if (cur == 'z' && i < str.length() - 2 && str.charAt(i + 2) == 'p') {
                result.append('p');
                i += 2;
            }
        }

        return result.toString();
    }
}
