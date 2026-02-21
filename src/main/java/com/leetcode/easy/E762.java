/*
 * 762. Prime Number of Set Bits in Binary Representation
 * https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Count the numbers in the given closed interval having a prime number of set bits in their binary representation.
 * <p>
 * The largest value should be less than 10^6, so the largest prime number to consider would be 19.
 */
class E762 {
    /**
     * Smoke Test
     */
    void main() {
        E762 x = new E762();

        System.out.println(x.countPrimeSetBits(6, 10) == 4);
        System.out.println(x.countPrimeSetBits(10, 15) == 5);
    }

    public int countPrimeSetBits(int left, int right) {
        int result = 0;

        for (int i = left; i <= right; i++) {
            if (isPrime(Integer.bitCount(i))) {
                result += 1;
            }
        }

        return result;
    }

    /**
     * Check only small primes, given the problem requirements
     */
    private boolean isPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 || x == 11 || x == 13 || x == 17 || x == 19);
    }
}
