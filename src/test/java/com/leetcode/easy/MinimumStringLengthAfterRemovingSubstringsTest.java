/*
 * 2696. Minimum String Length After Removing Substrings - https://leetcode.com/problems/minimum-string-length-after-removing-substrings/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MinimumStringLengthAfterRemovingSubstringsTest {
    private static final MinimumStringLengthAfterRemovingSubstrings instance = new MinimumStringLengthAfterRemovingSubstrings();

    @ParameterizedTest
    @CsvSource({ "ABFCACDB,2", "ACBBD,5" })
    void examples(String input, int expected) {
        int actual = instance.minLength(input);
        assertThat(actual).isEqualTo(expected);
    }
}
