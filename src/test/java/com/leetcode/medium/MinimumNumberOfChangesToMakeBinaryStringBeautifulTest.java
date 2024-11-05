/*
 * 2914. Minimum Number of Changes to Make Binary String Beautiful - https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MinimumNumberOfChangesToMakeBinaryStringBeautifulTest {
    private static final MinimumNumberOfChangesToMakeBinaryStringBeautiful instance = new MinimumNumberOfChangesToMakeBinaryStringBeautiful();

    @ParameterizedTest
    @CsvSource({ "1001,2", "10,1", "0000,0" })
    void examples(String input, int expected) {
        assertThat(instance.minChanges(input)).isEqualTo(expected);
    }
}
