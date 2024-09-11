/*
 * 2220. Minimum Bit Flips to Convert Number - https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MinimumBitFlipsToConvertNumberTest {
    private static final MinimumBitFlipsToConvertNumber instance = new MinimumBitFlipsToConvertNumber();

    @ParameterizedTest
    @CsvSource({ "10,7,3", "3,4,3" })
    void examples(int start, int goal, int expected) {
        assertThat(instance.minBitFlips(start, goal)).isEqualTo(expected);
    }
}
