/*
 * 2843. Count Symmetric Integers - https://leetcode.com/problems/count-symmetric-integers/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CountSymmetricIntegersTest {
    private static final CountSymmetricIntegers instance = new CountSymmetricIntegers();

    @ParameterizedTest
    @CsvSource({ "1,100,9", "1200,1230,4", "1,11,1", "12,12,0" })
    void examples(int left, int right, int expected) {
        assertThat(instance.countSymmetricIntegers(left, right)).isEqualTo(expected);
    }
}
