/*
 * 1545. Find Kth Bit in Nth Binary String - https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FindKthBitInNthBinaryStringTest {
    private static final FindKthBitInNthBinaryString instance = new FindKthBitInNthBinaryString();

    @ParameterizedTest
    @CsvSource({ "3,1,0", "4,11,1" })
    void examples(int len, int pos, char expected) {
        char actual = instance.findKthBit(len, pos);
        assertThat(actual).isEqualTo(expected);
    }
}
