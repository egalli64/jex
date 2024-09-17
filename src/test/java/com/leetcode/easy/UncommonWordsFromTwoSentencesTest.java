/*
 * 884. Uncommon Words from Two Sentences - https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class UncommonWordsFromTwoSentencesTest {
    private static final UncommonWordsFromTwoSentences instance = new UncommonWordsFromTwoSentences();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of("this apple is sweet", "this apple is sour", new String[] { "sweet", "sour" }), //
                Arguments.of("apple apple", "banana", new String[] { "banana" }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String left, String right, String[] expected) {
        var actual = instance.uncommonFromSentences(left, right);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }
}
