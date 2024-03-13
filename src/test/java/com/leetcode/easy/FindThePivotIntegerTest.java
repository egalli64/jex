/*
 * 2485. Find the Pivot Integer - https://leetcode.com/problems/find-the-pivot-integer/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FindThePivotIntegerTest {
    private static final FindThePivotInteger instance = new FindThePivotInteger();

    @ParameterizedTest
    @CsvSource({ "8,6", "1,1", "4,-1" })
    void examples(int n, int expected) {
        assertThat(instance.pivotInteger(n)).isEqualTo(expected);
    }
}
