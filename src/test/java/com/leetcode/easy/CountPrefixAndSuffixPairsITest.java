/*
 * 3042. Count Prefix and Suffix Pairs I - https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CountPrefixAndSuffixPairsITest {
    private static final CountPrefixAndSuffixPairsI instance = new CountPrefixAndSuffixPairsI();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[] { "a", "aba", "ababa", "aa" }, 4), //
                Arguments.of(new String[] { "pa", "papa", "ma", "mama" }, 2), //
                Arguments.of(new String[] { "abab", "ab" }, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] input, int expected) {
        assertThat(instance.countPrefixSuffixPairs(input)).isEqualTo(expected);
    }
}
