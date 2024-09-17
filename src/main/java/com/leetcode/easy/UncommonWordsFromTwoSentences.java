/*
 * 884. Uncommon Words from Two Sentences - https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two sentences, return a list (in any order) of all the uncommon words
 * <p>
 * Where:
 * <ul>
 * <li>A word is uncommon if it appears exactly once in one sentence, and does
 * not appear in the other one
 * <li>Each sentence contains single-space separated words of lowercase only
 * letters
 */
public class UncommonWordsFromTwoSentences {
    public String[] first(String s1, String s2) {
        Map<String, Integer> countLeft = new HashMap<>();
        Map<String, Integer> countRigth = new HashMap<>();

        String[] left = s1.split(" ");
        for (String cur : left) {
            countLeft.put(cur, countLeft.getOrDefault(cur, 0) + 1);
        }

        String[] right = s2.split(" ");
        for (String cur : right) {
            countRigth.put(cur, countRigth.getOrDefault(cur, 0) + 1);
        }

        List<String> result = new ArrayList<>(Math.max(countLeft.size(), countRigth.size()));
        for (var entry : countLeft.entrySet()) {
            String cur = entry.getKey();
            if (entry.getValue() == 1 && countRigth.getOrDefault(cur, 0) == 0) {
                result.add(cur);
            }
        }

        for (var entry : countRigth.entrySet()) {
            String cur = entry.getKey();
            if (entry.getValue() == 1 && countLeft.getOrDefault(cur, 0) == 0) {
                result.add(cur);
            }
        }

        return result.toArray(new String[] {});
    }
    
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> count = new HashMap<>();

        for (String cur : s1.split(" ")) {
            count.put(cur, count.getOrDefault(cur, 0) + 1);
        }
        for (String cur : s2.split(" ")) {
            count.put(cur, count.getOrDefault(cur, 0) + 1);
        }

        List<String> result = new ArrayList<>(count.size());
        for (var entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        return result.toArray(new String[] {});
    }
}
