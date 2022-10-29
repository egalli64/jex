/*
 * Prepare > Algorithms > Strings > Strong Password
 * https://www.hackerrank.com/challenges/strong-password/
 * <p>
 * A string, sized 1+, should contain
 * <ul>
 *     <li>at least 6 chars</li>
 *     <li>at least 1 digit</li>
 *     <li>at least 1 lowercase [a..z]</li>
 *     <li>at least 1 uppercase [A..Z]</li>
 *     <li>at least 1 special char in [!@#$%^&*()-+]</li>
 * </ul>
 * Only the above cited chars are in the input string
 * <p>
 * Return the number of missing char to make the string acceptable
 */
package com.hackerrank.algorithms.strings;

import java.util.Arrays;

public class StrongPassword {
    public static int minimumNumber(int n, String password) {
        // for uppercase, lowercase, digit, special
        int[] checks = new int[4];
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                checks[0] += 1;
            } else if (Character.isLowerCase(c)) {
                checks[1] += 1;
            } else if (Character.isDigit(c)) {
                checks[2] += 1;
            } else {
                checks[3] += 1;
            }
        }

        int details = (int) Arrays.stream(checks).filter(x -> x == 0).count();
        return Integer.max(details, n > 5 ? 0 : 6 - n);
    }
}
