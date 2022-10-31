/*
 * Prepare > Algorithms > Bit Manipulation > Flipping bits
 * https://www.hackerrank.com/challenges/flipping-bits/
 *
 * Given an integer in [0, 2^32]
 * Return the value having its significant bits flipped
 */
package com.hackerrank.algorithms.bit;

public class FlippingBits {
    public static long flippingBits(long n) {
        return 0xFFFF_FFFFL ^ n;
    }
}
