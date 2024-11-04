/*
 * 3163. String Compression III - https://leetcode.com/problems/string-compression-iii/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringCompressionIIITest {
    private static final StringCompressionIII instance = new StringCompressionIII();

    @ParameterizedTest
    @CsvSource({ "abcde,1a1b1c1d1e", "aaaaaaaaaaaaaabb,9a5a2b" })
    void examples(String input, String expected) {
        assertThat(instance.compressedString(input)).isEqualTo(expected);
    }
}
