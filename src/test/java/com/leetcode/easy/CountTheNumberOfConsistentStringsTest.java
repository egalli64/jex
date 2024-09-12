/*
 * 1684. Count the Number of Consistent Strings - https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
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

class CountTheNumberOfConsistentStringsTest {
    private static final CountTheNumberOfConsistentStrings instance = new CountTheNumberOfConsistentStrings();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of("ab", new String[] { "ad", "bd", "aaab", "baa", "badab" }, 2), //
                Arguments.of("abc", new String[] { "a", "b", "c", "ab", "ac", "bc", "abc" }, 7), //
                Arguments.of("cad", new String[] { "cc", "acd", "b", "ba", "bac", "bad", "ac", "d" }, 4) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String allowed, String[] words, int expected) {
        var actual = instance.countConsistentStrings(allowed, words);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
