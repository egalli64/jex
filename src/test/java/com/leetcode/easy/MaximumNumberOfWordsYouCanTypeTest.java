/*
 * 1935. Maximum Number of Words You Can Type - https://leetcode.com/problems/maximum-number-of-words-you-can-type/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumNumberOfWordsYouCanTypeTest {
    private static final MaximumNumberOfWordsYouCanType instance = new MaximumNumberOfWordsYouCanType();

    @ParameterizedTest
    @CsvSource({"hello world,ad,1", "leet code,lt,1", "leet code,e,0"})
    void examples(String words, String stoppers, int expected) {
        assertThat(instance.canBeTypedWords(words, stoppers)).isEqualTo(expected);
    }
}