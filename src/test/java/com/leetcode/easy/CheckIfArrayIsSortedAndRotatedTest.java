/*
 * 1752. Check if Array Is Sorted and Rotated - https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
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

class CheckIfArrayIsSortedAndRotatedTest {
    private static final CheckIfArrayIsSortedAndRotated instance = new CheckIfArrayIsSortedAndRotated();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 3, 4, 5, 1, 2 }, true), //
                Arguments.of(new int[] { 2, 1, 3, 4 }, false), //
                Arguments.of(new int[] { 1, 2, 3 }, true) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, boolean expected) {
        var actual = instance.check(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
