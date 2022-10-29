/*
    Prepare >Algorithms > Implementation > Cut the sticks
    https://www.hackerrank.com/challenges/cut-the-sticks/problem

    Discard the shortest pieces
    Cut that length from each of the longer sticks
    Return the number of sticks before each cut operation is performed
 */
package com.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;

public class CutTheSticks {
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        arr.sort(null);

        List<Integer> result = new ArrayList<>();
        result.add(arr.size());

        for (int i = 1; i < arr.size(); i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                result.add(arr.size() - i);
            }
        }

        return result;
    }
}
