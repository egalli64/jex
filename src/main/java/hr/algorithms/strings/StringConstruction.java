/*
 * Prepare > Algorithms > Strings > String Construction
 * https://www.hackerrank.com/challenges/string-construction/
 * <p>
 * Given a string
 * Return the number of different chars in it
 */
package hr.algorithms.strings;

import java.util.HashSet;

public class StringConstruction {
    public static int stringConstruction(String s) {
        HashSet<Character> result = new HashSet<>();
        for (char c : s.toCharArray()) {
            result.add(c);
        }
        return result.size();
    }
}
