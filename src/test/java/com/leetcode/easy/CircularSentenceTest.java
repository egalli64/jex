/*
 * 2490. Circular Sentence - https://leetcode.com/problems/circular-sentence/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CircularSentenceTest {
    private static final CircularSentence instance = new CircularSentence();

    @ParameterizedTest
    @CsvSource({ "leetcode exercises sound delightful,true", "eetcode,true", "Leetcode is cool,false" })
    void examples(String input, boolean expected) {
        assertThat(instance.isCircularSentence(input)).isEqualTo(expected);
    }
}
