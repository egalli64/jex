/*
 * 231. Power of Two - https://leetcode.com/problems/power-of-two/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class PowerOfTwoTest {
    private static final PowerOfTwo instance = new PowerOfTwo();

    @ParameterizedTest
    @CsvSource({"1,true", "16,true", "3,false", "-1,false"})
    void examples(int input, boolean expected) {
        assertThat(instance.isPowerOfTwo(input)).isEqualTo(expected);
    }
}