/*
 * 2418. Sort the People - https://leetcode.com/problems/sort-the-people/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given an array of names and an array of the associated _distinct_ heights.
 * <p>
 * Return names sorted in descending order by the people's heights.
 * <p>
 * Requisites: the arrays have the same size, no duplicates in heights
 */
public class SortThePeople {
    /**
     * Use as a buffer a tree map having heights as keys and comparing the keys in
     * reversed order.
     * 
     * @param names   array with names
     * @param heights the matching height for each name
     * @return the names sorted by height
     */
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> buffer = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < names.length; i++) {
            buffer.put(heights[i], names[i]);
        }
        return buffer.values().toArray(new String[buffer.size()]);
    }
}
