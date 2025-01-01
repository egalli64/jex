/*
 * 1422. Maximum Score After Splitting a String - https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MaximumScoreAfterSplittingAStringTest {
    private static final MaximumScoreAfterSplittingAString instance = new MaximumScoreAfterSplittingAString();

    @ParameterizedTest
    @CsvSource({ "011101,5", "00111,5", "1111,3" })
    void examples(String input, int expected) {
        assertThat(instance.maxScore(input)).isEqualTo(expected);
    }
}
