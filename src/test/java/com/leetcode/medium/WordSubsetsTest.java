/*
 * 916. Word Subsets - https://leetcode.com/problems/word-subsets/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class WordSubsetsTest {
    private static final WordSubsets instance = new WordSubsets();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[] { "amazon", "apple", "facebook", "google", "leetcode" }, //
                        new String[] { "lo", "eo" }, List.of("google", "leetcode")), //
                Arguments.of(new String[] { "amazon", "apple", "facebook", "google", "leetcode" }, //
                        new String[] { "e", "oo" }, List.of("facebook", "google")), //
                Arguments.of(new String[] { "amazon", "apple", "facebook", "google", "leetcode" }, //
                        new String[] { "e", "o" }, List.of("facebook", "google", "leetcode")), //
                Arguments.of(new String[] { "amazon", "apple", "facebook", "google", "leetcode" },
                        new String[] { "l", "e" }, List.of("apple", "google", "leetcode")) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] left, String[] right, List<String> expected) {
        var actual = instance.wordSubsets(left, right);
        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}
