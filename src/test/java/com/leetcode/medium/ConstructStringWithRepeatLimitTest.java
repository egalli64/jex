/*
 * 2182. Construct String With Repeat Limit - https://leetcode.com/problems/construct-string-with-repeat-limit/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConstructStringWithRepeatLimitTest {
    private static final ConstructStringWithRepeatLimit instance = new ConstructStringWithRepeatLimit();

    @ParameterizedTest
    @CsvSource({ "cczazcc,3,zzcccac", "aababab,2,bbabaa" })
    void examples(String input, int count, String expected) {
        String actual = instance.repeatLimitedString(input, count);
        assertThat(actual).isEqualTo(expected);
    }
}
