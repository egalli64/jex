/*
 * 1545. Find Kth Bit in Nth Binary String - https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given the "natural" index k (1 for first) in a n sized binary string build in
 * a peculiar way, return the char in k position
 * <p>
 * The string is built following these rules:
 * <ul>
 * <li>s1 = "0"
 * <li>si = s_i-1_ + "1" + reverse(invert(s_i-1_))
 * </ul>
 * where
 * <ul>
 * <li>+ is for concatenation
 * <li>reverse() return the passed string reverted
 * <li>invert() changes 0 into 1 and vice-versa
 */
public class FindKthBitInNthBinaryString {
    /**
     * No need to build the string, just reason on its structure
     * <ul>
     * <li>the size of the string is (2^n) - 1
     * <li>its first element is always '0'
     * <li>its central element is always '1'
     * <li>for i > 0, each element in position (2^i) - 1 is '1'
     * <li>otherwise split the string, if k is on the right, negate the result
     * 
     * @param n not used
     * @param k the requested index, assumed valid
     * @return the '0' or '1' char in k position
     */
    public char findKthBit(int n, int k) {
        if (k == 1) {
            return '0';
        }

        // k == (2^i) - 1
        if (((k + 1) & k) == 0) {
            return '1';
        }

        int len = (1 << n) - 1;
        if (k <= len / 2) {
            return findKthBit(n - 1, k);
        } else {
            return findKthBit(n - 1, len - k + 1) == '0' ? '1' : '0';
        }
    }
}
