/*
 * 165. Compare Version Numbers - https://leetcode.com/problems/compare-version-numbers/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CompareVersionNumbersTest {
    private static final CompareVersionNumbers instance = new CompareVersionNumbers();

    @ParameterizedTest
    @CsvSource({"1.2,1.10,-1", "1.01,1.001,0", "1.0,1.0.0.0,0","1.0.1,1,1"})
    void examples(String left, String right, int expected) {
        var actual = instance.compareVersion(left, right);
        assertThat(actual).isEqualTo(expected);
    }
}
