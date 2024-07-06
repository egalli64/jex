/*
 * 2582. Pass the Pillow - https://leetcode.com/problems/pass-the-pillow/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PassThePillowTest {
    private static final PassThePillow instance = new PassThePillow();

    @ParameterizedTest
    @CsvSource({ "4,5,2", "3,2,3" })
    void examples(int n, int time, int expected) {
        assertThat(instance.passThePillow(n, time)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "4,5,2", "3,2,3" })
    void examplesO1(int n, int time, int expected) {
        assertThat(instance.oOne(n, time)).isEqualTo(expected);
    }
}
