/*
 * LeetCode 6. Zigzag Conversion
 * https://leetcode.com/problems/zigzag-conversion/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ZigzagConversionTest {
    private static final ZigzagConversion instance = new ZigzagConversion();

    @ParameterizedTest
    @CsvSource({ "PAYPALISHIRING,3,PAHNAPLSIIGYIR", "PAYPALISHIRING,4,PINALSIGYAHRPI", "a,1,a" })
    void convertExamples(String input, int key, String expected) {
        String actual = instance.convert(input, key);
        assertThat(actual).isEqualTo(expected);
    }
}
