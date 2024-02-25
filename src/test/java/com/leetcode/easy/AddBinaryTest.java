/*
 * 67. Add Binary - https://leetcode.com/problems/add-binary/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AddBinaryTest {
    private static final AddBinary instance = new AddBinary();

    @ParameterizedTest
    @CsvSource({ "11,1,100", "1010,1011,10101" })
    void examples(String left, String right, String expected) {
        assertThat(instance.addBinary(left, right)).isEqualTo(expected);
    }
}
