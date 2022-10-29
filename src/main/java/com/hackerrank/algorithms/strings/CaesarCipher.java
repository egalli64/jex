/*
 * Prepare > Algorithms > Strings > Caesar Cipher
 * https://www.hackerrank.com/challenges/caesar-cipher-1/
 * <p>
 * Shift (circularly) each letter in the input string by k
 * Let the non-letter unchanged
 * Return the encrypted string
 */
package com.hackerrank.algorithms.strings;

public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append((char) ('a' + (c - 'a' + k) % 26));
            } else if (Character.isUpperCase(c)) {
                result.append((char) ('A' + (c - 'A' + k) % 26));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
