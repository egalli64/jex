/*
 * Prepare > Algorithms > Bit Manipulation > Sum vs XOR
 * https://www.hackerrank.com/challenges/sum-vs-xor/
 *
 * Given a long integer n
 * Return number of integer in [0, n] such as their sum equals their xor
 */
package com.hackerrank.algorithms.bit;

public class SumVsXOR {
    public static long sumXor(long n) {
        long zeroes = 64 - Long.numberOfLeadingZeros(n) - Long.bitCount(n);
        return (long) Math.pow(2, zeroes);
    }

    public static long sumXorNaive(long n) {
        int result = 1;

        for (int i = 1; i < n; i++) {
            if (n + i == (n ^ i)) {
                result += 1;
            }
        }

        return result;
    }
}
