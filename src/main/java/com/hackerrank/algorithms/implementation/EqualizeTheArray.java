/*
    Prepare > Algorithms > Implementation > Equalize the Array
    https://www.hackerrank.com/challenges/equality-in-a-array/problem

    Calculate the minimum number of deletions required to leave only elements of equal value
 */
package com.hackerrank.algorithms.implementation;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeTheArray {
    public static int equalizeArrayNLogN(List<Integer> arr) {
        arr.sort(null);

        int max = 1;
        int count = 1;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).equals(arr.get(i - 1))) {
                count += 1;
            } else {
                max = Math.max(count, max);
                count = 1;
            }
        }
        max = Math.max(count, max);

        return arr.size() - max;
    }

    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> buffer = new HashMap<>();
        for (Integer key : arr) {
            Integer prev = buffer.putIfAbsent(key, 1);
            if (prev != null) {
                buffer.put(key, prev + 1);
            }
        }
        return arr.size() - Collections.max(buffer.values());
    }
}
