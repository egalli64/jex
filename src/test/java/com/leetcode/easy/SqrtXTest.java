/*
 * 69. Sqrt(x) - https://leetcode.com/problems/sqrtx/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SqrtXTest {
    private static final SqrtX instance = new SqrtX();

    @ParameterizedTest
    @CsvSource({ "0,0", "4,2", "8,2", "2,1", "3,1", "2147395599,46339" })
    void examples(int input, int expected) {
        assertThat(instance.mySqrt(input)).isEqualTo(expected);
    }
}
