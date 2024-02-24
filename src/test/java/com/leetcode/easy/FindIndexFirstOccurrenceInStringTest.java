/*
 * 28. Find the Index of the First Occurrence in a String - https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FindIndexFirstOccurrenceInStringTest {
    private static final FindIndexFirstOccurrenceInString instance = new FindIndexFirstOccurrenceInString();

    @ParameterizedTest
    @CsvSource({ "sadbutsad,sad,0", "leetcode,leeto,-1", "aaaaa,bba,-1" })
    void strStrExamples(String input, String target, int expected) {
        int actual = instance.strStr(input, target);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "sadbutsad,sad,0", "leetcode,leeto,-1" })
    void indexOfExamples(String input, String target, int expected) {
        int actual = instance.indexOf(input, target);
        assertThat(actual).isEqualTo(expected);
    }
}
