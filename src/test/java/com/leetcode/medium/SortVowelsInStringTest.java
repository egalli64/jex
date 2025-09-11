/*
 * 2785. Sort Vowels in a String - https://leetcode.com/problems/sort-vowels-in-a-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SortVowelsInStringTest {
    private static final SortVowelsInString instance = new SortVowelsInString();

    @ParameterizedTest
    @CsvSource({"lEetcOde,lEOtcede", "lYmpH,lYmpH"})
    void examples(String input, String expected) {
        var actual = instance.sortVowels(input);
        assertThat(actual).isEqualTo(expected);
    }
}
