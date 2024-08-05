/*
 * 2053. Kth Distinct String in an Array - https://leetcode.com/problems/kth-distinct-string-in-an-array/description/
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

class KthDistinctStringInArrayTest {
    private static final KthDistinctStringInArray instance = new KthDistinctStringInArray();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[] { "d", "b", "c", "b", "c", "a" }, 2, "a"), //
                Arguments.of(new String[] { "aaa", "aa", "a" }, 1, "aaa"), //
                Arguments.of(new String[] { "a", "b", "a" }, 3, "") //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] input, int pos, String expected) {
        var actual = instance.kthDistinct(input, pos);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
