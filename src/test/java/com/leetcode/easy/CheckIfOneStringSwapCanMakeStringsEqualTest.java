/*
 * 1790. Check if One String Swap Can Make Strings Equal - https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CheckIfOneStringSwapCanMakeStringsEqualTest {
    private static final CheckIfOneStringSwapCanMakeStringsEqual instance = new CheckIfOneStringSwapCanMakeStringsEqual();

    @ParameterizedTest
    @CsvSource({ "bank,kanb,true", "attack,defend,false", "kelb,kelb,true", "npv,zpn,false", "abcd,dcba,false" })
    void examples(String left, String right, boolean expected) {
        assertThat(instance.areAlmostEqual(left, right)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "bank,kanb,true", "attack,defend,false", "kelb,kelb,true", "npv,zpn,false", "abcd,dcba,false" })
    void noCount(String left, String right, boolean expected) {
        assertThat(instance.noCount(left, right)).isEqualTo(expected);
    }
}
