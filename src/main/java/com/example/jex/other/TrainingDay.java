/*
    https://github.com/egalli64/jex
 */
package com.example.jex.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * N employees choose days in [0..9], 2 days will be selected in the same
 * interval. What is the max number of matching employees?
 * <li>N is in [1..100]
 * <li>each string has only chars in ['0'..'9'], has no duplicates, and it is
 * sized [0..10]
 */
public class TrainingDay {
    /**
     * 
     * @param choices each string represents the day choice for each employee
     * @return max number of attending employees
     */
    public static int solution(String[] choices) {
        HashMap<Character, Set<Integer>> counter = new HashMap<>();

        for (int i = 0; i < choices.length; i++) {
            for (char key : choices[i].toCharArray()) {
                if (counter.containsKey(key)) {
                    counter.get(key).add(i);
                } else {
                    Set<Integer> list = new HashSet<>();
                    list.add(i);
                    counter.put(key, list);
                }
            }
        }

        ArrayList<Set<Integer>> days = new ArrayList<>(counter.values());
        System.out.println(days);

        int result = 0;
        for (int i = 0; i < days.size() - 1; i++) {
            for (int j = i + 1; j < days.size(); j++) {
                Set<Integer> union = new HashSet<>(days.get(i));
                union.addAll(days.get(j));
                result = Math.max(union.size(), result);
            }
        }

        return result;
    }
}
