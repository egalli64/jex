/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * changePi - https://codingbat.com/prob/p170924
 * <p>
 * Generate recursively a new string where all the "pi" in the input string are
 * changed to "3.14"
 */
public class ChangePi {
    /**
     * Base case: if the string is sized less than two, return it
     * <p>
     * Recursive part: check if the first two chars in the string are 'p' and 'i',
     * return "3.14" or the current char concatenated with the recursion for the
     * substring starting from the next char
     * 
     * @param str a string
     * @return a string where each "pi" is replaced be "3.14"
     */
    public static String changePi(String str) {
        if (str.length() < 2) {
            return str;
        }

        if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
            return "3.14" + changePi(str.substring(2));
        } else {
            return str.charAt(0) + changePi(str.substring(1));
        }
    }
}
