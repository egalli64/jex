/*
    Prepare > Algorithms > Implementation > Fair Rations
    https://www.hackerrank.com/challenges/fair-rations/problem

    Make all the elements in input even increasing by 1 an element and its predecessor / successor (if any)
    Size of input is 2+
    Return the minimal number of increases, or "NO"
 */
package com.hackerrank.algorithms.implementation;

import java.util.List;

public class FairRations {
    public static String fairRations(List<Integer> B) {
        if (B.stream().filter(x -> x % 2 == 1).count() % 2 == 1) {
            return "NO";
        }

        int result = 0;
        for (int i = 0; i < B.size() - 1; i++) {
            if (B.get(i) % 2 == 1) {
                for (int j = i + 1; j < B.size(); j++) {
                    if (B.get(j) % 2 == 1) {
                        result += (j - i) * 2;
                        i = j;
                        break;
                    }
                }
            }
        }

        return Integer.toString(result);
    }
}
