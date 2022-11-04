/*
 * Prepare > Algorithms > Strings > Weighted Uniform Strings
 * https://www.hackerrank.com/challenges/weighted-uniform-string/
 *
 * Given a non-empty string and a non-empty list of integers
 * Return a list of strings "Yes" / "No"
 *  Yes meaning that the associated query for matching weighted uniform string is successful
 *
 * A uniform string consists of a single character repeated zero or more times
 * Its associated value is the char value (a = 1, ..., z = 26) multiplied for its size
 */
package com.hackerrank.algorithms.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeightedUniformStrings {
    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        List<String> result = new ArrayList<>(queries.size());
        Set<Integer> weights = new HashSet<>();

        char prev = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            weights.add(count * (1 + prev - 'a'));
            char cur = s.charAt(i);
            if (prev == cur) {
                count += 1;
            } else {
                prev = cur;
                count = 1;
            }
        }
        weights.add(count * (1 + prev - 'a'));
        queries.forEach(q -> result.add(weights.contains(q) ? "Yes" : "No"));

        return result;
    }
}
