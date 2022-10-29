/*
    Prepare > Algorithms > Implementation > Manasa and Stones
    https://www.hackerrank.com/challenges/manasa-and-stones/

    Starting from 0, given two possible positive (non-zero) differences, a and b
    Get all the possible values after n positive increases, and return them, in ascending order
 */
package com.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones {
    public static List<Integer> stones(int n, int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        List<Integer> result = new ArrayList<>(n);
        result.add(a * (n - 1));
        for (int i = 1; i < n; i++) {
            int current = a * (n - i - 1) + b * i;
            if (result.get(result.size() - 1) != current) {
                result.add(current);
            }
        }

        return result;
    }

    public static List<Integer> sortingStones(int n, int a, int b) {
        Set<Integer> result = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            result.add(a * i + b * (n - i - 1));
        }

        return new ArrayList<>(result);
    }

    // too expensive
    public static List<Integer> recursiveStones(int n, int a, int b) {
        Set<Integer> result = new TreeSet<>();

        recursiveStones(result, n, a, b, 0);

        // since Java 16
        return result.stream().toList();
    }

    private static void recursiveStones(Set<Integer> result, int n, int a, int b, int current) {
        if (n == 1) {
            result.add(current);
        } else {
            recursiveStones(result, n - 1, a, b, current + a);
            recursiveStones(result, n - 1, a, b, current + b);
        }
    }
}
