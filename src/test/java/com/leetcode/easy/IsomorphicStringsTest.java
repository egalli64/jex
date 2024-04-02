/*
 * 205. Isomorphic Strings - https://leetcode.com/problems/isomorphic-strings/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class IsomorphicStringsTest {
    private static final IsomorphicStrings instance = new IsomorphicStrings();

    @ParameterizedTest
    @CsvSource({ "egg,add,true", "foo,bar,false", "paper,title, true" })
    void examples(String left, String right, boolean expected) {
        assertThat(instance.isIsomorphic(left, right)).isEqualTo(expected);
    }
}
