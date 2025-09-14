/*
 * 966. Vowel Spellchecker - https://leetcode.com/problems/vowel-spellchecker/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.*;

/**
 * Check the queries against the word list
 * If a query is in the word list, return the query
 * If a query match case-insensitive, return the (first matching) word
 * If a query match with misspelt vowels, ditto
 * No match, return an empty string
 */
public class VowelSpellchecker {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseMap = new HashMap<>();
        Map<String, String> vowelMap = new HashMap<>();

        for (String word : wordlist) {
            String lower = word.toLowerCase();
            caseMap.putIfAbsent(lower, word);
            vowelMap.putIfAbsent(noVowel(lower), word);
        }

        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (wordSet.contains(queries[i])) {
                result[i] = queries[i];
            } else {
                String lower = queries[i].toLowerCase();
                result[i] = caseMap.containsKey(lower) ? caseMap.get(lower)
                        : vowelMap.getOrDefault(noVowel(lower), "");
            }
        }

        return result;
    }

    private String noVowel(String s) {
        StringBuilder result = new StringBuilder(s.length());

        for (char c : s.toCharArray()) {
            result.append("aeiou".indexOf(c) == -1 ? c : '_');
        }

        return result.toString();
    }
}
