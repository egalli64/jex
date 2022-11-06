/*
    Prepare > Algorithms > Implementation > Non-Divisible Subset
    https://www.hackerrank.com/challenges/non-divisible-subset/problem

    Given an integer k and a list of integer
    Return the size of the biggest subset where
     the sum of any couple is not divisible by k

    --
    We are not really interested in the actual numbers, but their modulo k
    We can take
        1 value divisible by k (if available)
        1 divisible by k / 2 (if available and if k is even)
        all the ones divisible by i XOR all the one divisible by k - i
            for i in the first half of the array - choose the biggest one
            it is a bit tricky to calculate where to stop looping (even vs odd k)
 */
package com.hackerrank.algorithms.implementation;

import java.util.List;

public class NonDivisibleSubset {
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] mods = new int[k];
        for (int cur : s) {
            mods[cur % k] += 1;
        }

        int result = mods[0] != 0 ? 1 : 0;
        int middle = k / 2;
        if (k % 2 == 0) {
            result += Math.min(1, mods[middle]);
        } else {
            middle += 1;
        }

        for (int i = 1; i < middle; i++) {
            result += Math.max(mods[i], mods[k - i]);
        }

        return result;
    }
}
