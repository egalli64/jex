/*
 * 30. Substring with Concatenation of All Words - https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SubstringWithConcatenationOfAllWordsTest {
    private static final SubstringWithConcatenationOfAllWords instance = new SubstringWithConcatenationOfAllWords();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of("barfoothefoobarman", new String[] { "foo", "bar" }, List.of(0, 9)), //
                Arguments.of("wordgoodgoodgoodbestword", new String[] { "word", "good", "best", "word" }, List.of()), //
                Arguments.of("barfoofoobarthefoobarman", new String[] { "bar", "foo", "the" }, List.of(6, 9, 12)), //
                Arguments.of("lingmindraboofooowingdingbarrwingmonkeypoundcake", new String[] { "fooo","barr","wing","ding","wing" }, List.of(13)) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String input, String[] words, List<Integer> expected) {
        List<Integer> actual = instance.findSubstring(input, words);
        assertThat(actual).isEqualTo(expected);
    }
}
