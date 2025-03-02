/*
 * 2570. Merge Two 2D Arrays by Summing Values - https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/
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

class MergeTwo2DArraysBySummingValuesTest {
    private static final MergeTwo2DArraysBySummingValues instance = new MergeTwo2DArraysBySummingValues();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[][] { { 1, 2 }, { 2, 3 }, { 4, 5 } }, //
                        new int[][] { { 1, 4 }, { 3, 2 }, { 4, 1 } }, //
                        new int[][] { { 1, 6 }, { 2, 3 }, { 3, 2 }, { 4, 6 } }), //
                Arguments.of(new int[][] { { 2, 4 }, { 3, 6 }, { 5, 5 } }, //
                        new int[][] { { 1, 3 }, { 4, 3 } }, //
                        new int[][] { { 1, 3 }, { 2, 4 }, { 3, 6 }, { 4, 3 }, { 5, 5 } }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] left, int[][] right, int[][] expected) {
        var actual = instance.mergeArrays(left, right);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
