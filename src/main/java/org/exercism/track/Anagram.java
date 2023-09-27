/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Anagram: https://exercism.org/tracks/java/exercises/anagram
 * <p>
 * Lowercase and uppercase characters are equivalent. A word is not its own
 * anagram.
 */
class Anagram {
    private String word;

    public Anagram(String word) {
        this.word = word.toLowerCase();
    }

    /**
     * Keep only the word anagrams in the resulting list
     * 
     * @param candidates a list of strings
     * @return a filtered list
     */
    public List<String> match(List<String> candidates) {
        return candidates.stream().filter(this::isAnagram).toList();
    }

    /**
     * Check if the passed string is an anagram
     * 
     * @param candidate a string
     * @return true for anagram
     */
    private boolean isAnagram(String candidate) {
        String s = candidate.toLowerCase();
        if (s.equals(word)) {
            return false;
        }

        Map<Character, Integer> checker = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer count = checker.putIfAbsent(c, 1);
            if (count != null) {
                checker.put(c, count + 1);
            }
        }

        for (char c : word.toCharArray()) {
            Integer count = checker.get(c);
            if (count == null || count == 0) {
                return false;
            } else if (count == 1) {
                checker.remove(c);
            } else {
                checker.put(c, count - 1);
            }
        }

        return checker.isEmpty();
    }
}
