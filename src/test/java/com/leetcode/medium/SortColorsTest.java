/*
 * 75. Sort Colors - https://leetcode.com/problems/sort-colors/description/
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

class SortColorsTest {
    private static final SortColors instance = new SortColors();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 0, 2, 1, 1, 0 }, new int[] { 0, 0, 1, 1, 2, 2 }), //
                Arguments.of(new int[] { 2, 0, 1 }, new int[] { 0, 1, 2 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] values, int[] expected) {
        instance.sortColors(values);
        Assertions.assertThat(values).isEqualTo(expected);
    }
}
