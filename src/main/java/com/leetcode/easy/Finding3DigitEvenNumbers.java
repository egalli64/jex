/*
 * 2094. Finding 3-Digit Even Numbers - https://leetcode.com/problems/finding-3-digit-even-numbers/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of digits (possibly with repetitions) return all the possible
 * even number in [100 .. 999] that can be built from the given digits, in an
 * ordered array.
 */
public class Finding3DigitEvenNumbers {
    public int[] findEvenNumbers(int[] digits) {
        int[] counter = new int[10];
        for (int digit : digits)
            counter[digit] += 1;

        List<Integer> buffer = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            if (counter[i] > 0) {
                for (int j = 0; j < 10; j++) {
                    if (counter[j] >= (i == j ? 2 : 1)) {
                        for (int k = 0; k < 10; k += 2) {
                            int required = (i == k) ? 2 : 1;
                            if (j == k) {
                                required += 1;
                            }
                            if (counter[k] >= required) {
                                buffer.add(i * 100 + j * 10 + k);
                            }
                        }
                    }
                }
            }
        }

        int[] result = new int[buffer.size()];
        for (int i = 0; i < buffer.size(); i++) {
            result[i] = buffer.get(i);
        }
        return result;
    }
}
