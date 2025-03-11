/*
 * 1358. Number of Substrings Containing All Three Characters - https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NumberSubstringsContainingAllThreeCharactersTest {
    private static final NumberSubstringsContainingAllThreeCharacters instance = new NumberSubstringsContainingAllThreeCharacters();

    @ParameterizedTest
    @CsvSource({ "abcabc,10", "aaacb,3", "abc,1" })
    void examples(String input, int expected) {
        assertThat(instance.numberOfSubstrings(input)).isEqualTo(expected);
    }
}
