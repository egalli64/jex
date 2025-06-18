/*
 * 2966. Divide Array Into Arrays With Max Difference - https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/
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

class DivideArrayIntoArraysWithMaxDifferenceTest {
    private static final DivideArrayIntoArraysWithMaxDifference instance = new DivideArrayIntoArraysWithMaxDifference();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 3, 4, 8, 7, 9, 3, 5, 1 }, 2,
                        new int[][] { { 1, 1, 3 }, { 3, 4, 5 }, { 7, 8, 9 } }), //
                Arguments.of(new int[] { 2, 4, 2, 2, 5, 2 }, 2, new int[][] {}), //
                Arguments.of(new int[] { 4, 2, 9, 8, 2, 12, 7, 12, 10, 5, 8, 5, 5, 7, 9, 2, 5, 11 }, 14, new int[][] {
                        { 2, 2, 2 }, { 4, 5, 5 }, { 5, 5, 7 }, { 7, 8, 8 }, { 9, 9, 10 }, { 11, 12, 12 } }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int target, int[][] expected) {
        var actual = instance.divideArray(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
