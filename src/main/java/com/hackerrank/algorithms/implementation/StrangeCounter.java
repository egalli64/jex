/*
 * Prepare > Algorithms > Implementation > Strange Counter
 * https://www.hackerrank.com/challenges/strange-code/
 * <p>
 * Map the integer in input to a counter based on 3, doubled each time:
 * 3, 2, 1, then 6 ... 1, then 12 ... 1, then 24 ... 1
 * So given 4, return 6
 * 1 2 3 - 4 5 6 7 8 9 - 10 11 12 13 14 15 16 17 18 19 20 21 - ...
 * 3 2 1 - 6 5 4 3 2 1 - 12 11 10  9  8  7  6  5  4  3  2  1 - ...
 */
package com.hackerrank.algorithms.implementation;

public class StrangeCounter {
    public static long strangeCounter(long t) {
        long max = 3;
        while(t > max) {
            max = max * 2 + 3;
        }
        return max - t + 1;
    }
}
