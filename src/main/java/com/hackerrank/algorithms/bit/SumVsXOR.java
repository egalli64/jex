/*
 * Prepare > Algorithms > Bit Manipulation > Sum vs XOR
 * https://www.hackerrank.com/challenges/sum-vs-xor/
 *
 * Given a long integer n
 * Return number of integer in [0, n] such as their sum equals their xor
 *
 * comparing against 1 -> 1
 * 0 ok
 * 1 -
 *
 * comparing against 4 -> 100
 * 000 ok
 * 001 ok
 * 010 ok
 * 011 ok
 * 100 -
 *
 * comparing against 5 -> 101
 * 000 ok
 * 001 -
 * 010 ok
 * 011 -
 * 100 -
 */
package com.hackerrank.algorithms.bit;

public class SumVsXOR {
    public static long sumXor(long n) {
        // number of significant zeroes in the binary representation of n
        long zeroes = 64 - Long.numberOfLeadingZeros(n) - Long.bitCount(n);
        // the combinations of the given number of zeroes gives the result
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
