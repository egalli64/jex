/*
 * 14. Longest Common Prefix - https://leetcode.com/problems/longest-common-prefix/description/
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

class LongestCommonPrefixTest {
    private static final LongestCommonPrefix instance = new LongestCommonPrefix();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[] { "flower", "flow", "flight" }, "fl"), //
                Arguments.of(new String[] { "dog", "racecar", "car" }, "") //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] input, String expected) {
        String actual = instance.longestCommonPrefix(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
