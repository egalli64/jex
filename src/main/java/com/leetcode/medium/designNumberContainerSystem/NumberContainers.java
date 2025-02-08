/*
 * 2349. Design a Number Container System - https://leetcode.com/problems/design-a-number-container-system/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium.designNumberContainerSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * An int container that allows
 * <li>insert/replace of elements by index
 * <li>search of element by value - returns its lowest index or -1 if not found
 * <p>
 * Use a map index to number for insert/replace, and a reversed map from number
 * to indices for search.
 */
class NumberContainers {
    Map<Integer, Integer> store;
    Map<Integer, TreeSet<Integer>> reversed;

    public NumberContainers() {
        this.store = new HashMap<>();
        this.reversed = new HashMap<>();
    }

    public void change(int index, int number) {
        Integer prev = store.put(index, number);
        if (prev != null && prev != number) {
            reversed.get(prev).remove(index);
        }

        var indices = reversed.putIfAbsent(number, new TreeSet<>(Set.of(index)));
        if (indices != null) {
            indices.add(index);
        }
    }

    public int find(int number) {
        TreeSet<Integer> keys = reversed.get(number);
        return keys == null || keys.isEmpty() ? -1 : keys.first();
    }

    /**
     * Smoke test
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        NumberContainers nc = new NumberContainers();

        int key = 3;
        int value = 99;

        nc.change(key, value);
        int key2 = nc.find(99);
        System.out.printf("key (%d) should match key2 (%d)\n", key, key2);
        assert key == key2;
    }
}
