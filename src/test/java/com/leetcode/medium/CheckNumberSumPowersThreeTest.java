/*
 * 1780. Check if Number is a Sum of Powers of Three - https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CheckNumberSumPowersThreeTest {
    private static final CheckNumberSumPowersThree instance = new CheckNumberSumPowersThree();

    @ParameterizedTest
    @CsvSource({ "12,true", "91,true", "21,false" })
    void examples(int input, boolean expected) {
        assertThat(instance.checkPowersOfThree(input)).isEqualTo(expected);
    }
}
