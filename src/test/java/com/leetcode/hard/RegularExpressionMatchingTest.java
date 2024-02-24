/*
 * 10. Regular Expression Matching - https://leetcode.com/problems/regular-expression-matching/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RegularExpressionMatchingTest {
    private static final RegularExpressionMatching instance = new RegularExpressionMatching();

    @ParameterizedTest
    @CsvSource({ "aa,a,false", "aa,a*,true", "ab,.*,true" })
    void examples(String input, String target, boolean expected) {
        boolean actual = instance.isMatch(input, target);
        assertThat(actual).isEqualTo(expected);
    }
}
