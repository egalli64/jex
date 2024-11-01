/*
 * 1957. Delete Characters to Make Fancy String - https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DeleteCharactersToMakeFancyStringTest {
    private static final DeleteCharactersToMakeFancyString instance = new DeleteCharactersToMakeFancyString();

    @ParameterizedTest
    @CsvSource({ "leeetcode,leetcode", "aaabaaaa,aabaa", "aab, aab" })
    void examples(String input, String expected) {
        assertThat(instance.makeFancyString(input)).isEqualTo(expected);
    }
}
