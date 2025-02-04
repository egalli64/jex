/*
 * 2022. Convert 1D Array Into 2D Array - https://leetcode.com/problems/convert-1d-array-into-2d-array/description/
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

class Convert1DArrayInto2DArrayTest {
    private static final Convert1DArrayInto2DArray instance = new Convert1DArrayInto2DArray();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3, 4 }, 2, 2, new int[][] { { 1, 2 }, { 3, 4 } }), //
                Arguments.of(new int[] { 1, 2, 3 }, 1, 3, new int[][] { { 1, 2, 3 } }), //
                Arguments.of(new int[] { 1, 2, 3 }, 3, 1, new int[][] { { 1 }, { 2 }, { 3 } }), //
                Arguments.of(new int[] { 1, 2 }, 1, 1, new int[][] {}) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int m, int n, int[][] expected) {
        var actual = instance.construct2DArray(input, m, n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void rawExamples(int[] input, int m, int n, int[][] expected) {
        var actual = instance.raw(input, m, n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
