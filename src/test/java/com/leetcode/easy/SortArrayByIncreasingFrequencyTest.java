/*
 * 1636. Sort Array by Increasing Frequency - https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
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

class SortArrayByIncreasingFrequencyTest {
    private static final SortArrayByIncreasingFrequency instance = new SortArrayByIncreasingFrequency();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 1, 2, 2, 2, 3 }, new int[] { 3, 1, 1, 2, 2, 2 }), //
                Arguments.of(new int[] { 2, 3, 1, 3, 2 }, new int[] { 1, 3, 3, 2, 2 }), //
                Arguments.of(new int[] { -1, 1, -6, 4, 5, -6, 1, 4, 1 }, new int[] { 5, -1, 4, 4, -6, -6, 1, 1, 1 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int[] expected) {
        int[] actual = instance.frequencySort(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
