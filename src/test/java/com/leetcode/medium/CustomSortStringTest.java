/*
 * 791. Custom Sort String - https://leetcode.com/problems/custom-sort-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CustomSortStringTest {
    private static final CustomSortString instance = new CustomSortString();

    @ParameterizedTest
    @CsvSource({ "cba,abcd,cbad", "bcafg,abcd,bcad" })
    void examples(String order, String input, String expected) {
        String actual = instance.customSortString(order, input);
        assertThat(actual).isEqualTo(expected);
    }
}
