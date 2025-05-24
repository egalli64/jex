/*
 * 2942. Find Words Containing Character - https://leetcode.com/problems/add-binary/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.List;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindWordsContainingCharacterTest {
    private static final FindWordsContainingCharacter instance = new FindWordsContainingCharacter();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[] { "leet", "code" }, 'e', List.of(0, 1)), //
                Arguments.of(new String[] { "abc", "bcd", "aaaa", "cbc" }, 'a', List.of(0, 2)), //
                Arguments.of(new String[] { "abc", "bcd", "aaaa", "cbc" }, 'z', List.of()) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] input, char target, List<Integer> expected) {
        var actual = instance.findWordsContaining(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
