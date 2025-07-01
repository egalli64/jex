/*
 * 3330. Find the Original Typed String I - https://leetcode.com/problems/find-the-original-typed-string-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FindTheOriginalTypedStringITest {
    private static final FindTheOriginalTypedStringI instance = new FindTheOriginalTypedStringI();

    @ParameterizedTest
    @CsvSource({ "abbcccc,5", "abcd,1", "aaaa,4" })
    void examples(String input, int expected) {
        assertThat(instance.possibleStringCount(input)).isEqualTo(expected);
    }
}
