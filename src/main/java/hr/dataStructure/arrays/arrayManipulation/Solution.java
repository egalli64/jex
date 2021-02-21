/*
    Practice > Data Structures > Arrays > Array Manipulation
    https://www.hackerrank.com/challenges/crush/problem
    https://thisthread.blogspot.com/2021/02/hackerrank-array-manipulation.html
 */
package hr.dataStructure.arrays.arrayManipulation;

import java.util.stream.LongStream;

public class Solution {
    static long arrayManipulation(int n, int[][] queries) {
        long[] data = new long[n + 1];

        for(int[] query: queries) {
            data[query[0]-1] += query[2];
            data[query[1]] -= query[2];
        }

        for(int i = 1; i < data.length; i++) {
            data[i] += data[i-1];
        }

        return LongStream.of(data).max().orElseThrow();
    }
}
