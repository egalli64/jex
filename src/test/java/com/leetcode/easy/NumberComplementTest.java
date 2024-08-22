/*
 * 476. Number Complement - https://leetcode.com/problems/number-complement/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NumberComplementTest {
    private static final NumberComplement instance = new NumberComplement();

    @ParameterizedTest
    @CsvSource({ "5,2", "1,0" })
    void examples(int value, int expected) {
        assertThat(instance.findComplement(value)).isEqualTo(expected);
    }
}
