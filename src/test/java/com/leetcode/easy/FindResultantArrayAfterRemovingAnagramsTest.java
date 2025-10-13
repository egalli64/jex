/*
 * 2273. Find Resultant Array After Removing Anagrams - https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class FindResultantArrayAfterRemovingAnagramsTest {
    private static final FindResultantArrayAfterRemovingAnagrams instance = new FindResultantArrayAfterRemovingAnagrams();

    static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(new String[]{"abba", "baba", "bbaa", "cd", "cd"}, List.of("abba", "cd")),
                Arguments.of(new String[]{"a", "b", "c", "d", "e"}, List.of("a", "b", "c", "d", "e"))
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] input, List<String> expected) {
        var actual = instance.removeAnagrams(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
