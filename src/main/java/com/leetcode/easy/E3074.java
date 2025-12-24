/*
 * 3074. Apple Redistribution into Boxes
 * https://leetcode.com/problems/apple-redistribution-into-boxes/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Push the apples in the boxes (having the given capacity).
 * Return the minimum number of boxes required.
 * <p>
 * Both arrays are not empty.
 */
public class E3074 {
    /**
     * Smoke test
     */
    static void main() {
        E3074 x = new E3074();
        System.out.println(x.minimumBoxes(new int[]{1, 3, 2}, new int[]{4, 3, 1, 5, 2}) == 2);
        System.out.println(x.minimumBoxes(new int[]{5, 5, 5}, new int[]{2, 4, 2, 7}) == 4);
    }

    public int minimumBoxes(int[] apple, int[] capacity) {
        int apples = IntStream.of(apple).sum();
        Arrays.sort(capacity);

        int result = 0;

        for (int i = capacity.length - 1; i >= 0 && apples > 0; i--) {
            apples -= capacity[i];
            result += 1;
        }

        return result;
    }
}
