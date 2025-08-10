/*
 * 869. Reordered Power of 2 - https://leetcode.com/problems/reordered-power-of-2/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ReorderedPowerOf2Test {
    private static final ReorderedPowerOf2 instance = new ReorderedPowerOf2();

    @ParameterizedTest
    @CsvSource({"1,true", "10,false", "46,true"})
    void examples(int input, boolean expected) {
        assertThat(instance.reorderedPowerOf2(input)).isEqualTo(expected);
    }
}
