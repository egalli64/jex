/*
 * 1323. Maximum 69 Number - https://leetcode.com/problems/maximum-69-number/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Maximum69NumberTest {
    private static final Maximum69Number instance = new Maximum69Number();

    @ParameterizedTest
    @CsvSource({"9669,9969", "9996,9999", "9999,9999"})
    void examples(int input, int expected) {
        assertThat(instance.maximum69Number(input)).isEqualTo(expected);
    }
}