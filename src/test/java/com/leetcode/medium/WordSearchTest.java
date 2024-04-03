/*
 * 79. Word Search - https://leetcode.com/problems/word-search/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class WordSearchTest {
    private static final WordSearch instance = new WordSearch();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } },
                        "ABCCED", true),
                Arguments.of(new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } },
                        "SEE", true),
                Arguments.of(new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } },
                        "ABCB", false));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(char[][] input, String target, boolean expected) {
        boolean actual = instance.exist(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
