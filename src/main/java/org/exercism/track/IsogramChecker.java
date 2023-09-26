/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import java.util.HashSet;
import java.util.Set;

/**
 * Isogram: https://exercism.org/tracks/java/exercises/isogram
 */
class IsogramChecker {
    /**
     * No repeating letters (case insensitive) in the passed string. The only
     * characters that are not to be checked are '-' and ' '.
     * 
     * @param phrase a string
     * @return true if an isogram is detected
     */
    boolean isIsogram(String phrase) {
        Set<Character> checker = new HashSet<>();

        for (char c : phrase.toCharArray()) {
            if (c == '-' || c == ' ') {
                continue;
            }

            Character cur = Character.toLowerCase(c);
            if (checker.contains(cur)) {
                return false;
            } else {
                checker.add(cur);
            }
        }

        return true;
    }
}