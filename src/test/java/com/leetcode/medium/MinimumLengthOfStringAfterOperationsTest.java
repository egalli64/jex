/*
 * 3223. Minimum Length of String After Operations - https://leetcode.com/problems/minimum-length-of-string-after-operations/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MinimumLengthOfStringAfterOperationsTest {
    private static final MinimumLengthOfStringAfterOperations instance = new MinimumLengthOfStringAfterOperations();

    @ParameterizedTest
    @CsvSource({ "abaacbcbb,5", "aa,2", "waoji,5", "abbcccddddeeeee,7" })
    void examples(String input, int expected) {
        assertThat(instance.minimumLength(input)).isEqualTo(expected);
    }
}
