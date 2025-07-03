/*
 * 3304. Find the K-th Character in String Game I - https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FindTheKCharacterInStringGameITest {
    private static final FindTheKCharacterInStringGameI instance = new FindTheKCharacterInStringGameI();

    @ParameterizedTest
    @CsvSource({ "5,b", "10,c" })
    void examples(int k, char expected) {
        assertThat(instance.kthCharacter(k)).isEqualTo(expected);
    }
}