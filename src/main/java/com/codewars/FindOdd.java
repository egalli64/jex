package com.codewars;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find the one that appears an odd number of times.
 * <p>
 * There will always be only one integer that appears an odd number of times.
 * <p>
 * www.codewars.com/kata/54da5a58ea159efa38000836/java
 */
public class FindOdd {
    public static int findIt(int[] a) {
        Set<Integer> buffer = new HashSet<>();
        for (Integer cur : a) {
            if (!buffer.remove(cur)) {
                buffer.add(cur);
            }
        }

        return buffer.iterator().next();
    }
}