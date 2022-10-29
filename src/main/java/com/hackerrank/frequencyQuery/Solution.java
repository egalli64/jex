package com.hackerrank.frequencyQuery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * www.hackerrank.com/challenges/frequency-queries/problem
 */
public class Solution {
    private static void edit(Map<Integer, Integer> freqs, Map<Integer, Integer> inverse, Integer key, boolean add) {
        Integer freq = freqs.getOrDefault(key, 0);
        if (freq > 0) {
            inverse.put(freq, inverse.get(freq) - 1);
        }

        if (add) {
            freqs.put(key, freq + 1);
        } else if (freq > 0) {
            freqs.put(key, freq - 1);
        }

        Integer newFreq = freqs.get(key);
        if (newFreq != null) {
            inverse.put(newFreq, inverse.getOrDefault(newFreq, 0) + 1);
        }
    }

    private static boolean check(Map<Integer, Integer> inverse, Integer key) {
        Integer value = inverse.get(key);
        return value != null && value > 0;
    }

    static List<Integer> freqQuery(List<List<Integer>> queries) {
        // number -> frequency
        Map<Integer, Integer> numberFrequency = new HashMap<>();
        // frequency -> counter of numbers
        Map<Integer, Integer> frequencyCounter = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (List<Integer> query : queries) {
            Integer input = query.get(1);

            switch (query.get(0)) {
                // insert number
                case 1 -> edit(numberFrequency, frequencyCounter, input, true);
                // delete number
                case 2 -> edit(numberFrequency, frequencyCounter, input, false);
                // check frequency
                case 3 -> result.add(check(frequencyCounter, input) ? 1 : 0);
                default -> throw new IllegalStateException("Bad command");
            }
        }

        return result;
    }
}
