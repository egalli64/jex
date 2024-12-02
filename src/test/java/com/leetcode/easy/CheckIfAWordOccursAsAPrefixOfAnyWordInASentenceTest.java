/*
 * 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence - https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CheckIfAWordOccursAsAPrefixOfAnyWordInASentenceTest {
    private static final CheckIfAWordOccursAsAPrefixOfAnyWordInASentence instance = new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();

    @ParameterizedTest
    @CsvSource({ "i love eating burger,burg,4", "this problem is an easy problem,pro,2", "i am tired,you,-1" })
    void examples(String sentence, String target, int expected) {
        assertThat(instance.isPrefixOfWord(sentence, target)).isEqualTo(expected);
    }
}
