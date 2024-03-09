/*
 * 88. Merge Sorted Array - https://leetcode.com/problems/merge-sorted-array/description/
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

class MergeSortedArrayTest {
    private static final MergeSortedArray instance = new MergeSortedArray();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, new int[] { 1, 2, 2, 3, 5, 6 }), //
                Arguments.of(new int[] { 1 }, 1, new int[] {}, new int[] { 1 }), //
                Arguments.of(new int[] { 0 }, 0, new int[] { 1 }, new int[] { 1 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] left, int n, int[] right, int[] expected) {
        instance.merge(left, n, right, right.length);
        Assertions.assertThat(left).isEqualTo(expected);
    }
}
