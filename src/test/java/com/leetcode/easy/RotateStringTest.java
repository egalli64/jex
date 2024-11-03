/*
 * 796. Rotate String - https://leetcode.com/problems/rotate-string/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RotateStringTest {
    private static final RotateString instance = new RotateString();

    @ParameterizedTest
    @CsvSource({ "abcde,cdeab,true", "abcde,abced,false" })
    void examples(String input, String goal, boolean expected) {
        assertThat(instance.rotateString(input, goal)).isEqualTo(expected);
    }
}
