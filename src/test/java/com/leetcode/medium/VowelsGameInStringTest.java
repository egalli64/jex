/*
 * 3227. Vowels Game in a String - https://leetcode.com/problems/vowels-game-in-a-string/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class VowelsGameInStringTest {
    private static final VowelsGameInString instance = new VowelsGameInString();

    @ParameterizedTest
    @CsvSource({"leetcoder,true", "bbcd,false"})
    void examples(String input, boolean expected) {
        var actual = instance.doesAliceWin(input);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"leetcoder,true", "bbcd,false"})
    void modernExamples(String input, boolean expected) {
        var actual = instance.modern(input);
        assertThat(actual).isEqualTo(expected);
    }
}
