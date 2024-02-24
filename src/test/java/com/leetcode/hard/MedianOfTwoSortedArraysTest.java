/*
 * LeetCode 4. Median of Two Sorted Arrays
 * Leetcode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MedianOfTwoSortedArraysTest {
    private static final MedianOfTwoSortedArrays instance = new MedianOfTwoSortedArrays();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 3 }, new int[] { 2 }, 2.0), //
                Arguments.of(new int[] { 1, 2 }, new int[] { 3, 4 }, 2.5) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] left, int[] right, double expected) {
        double actual = instance.findMedianSortedArrays(left, right);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void linearExamples(int[] left, int[] right, double expected) {
        double actual = instance.linearSolution(left, right);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void shuffledExamples(int[] left, int[] right, double expected) {
        double actual = instance.findMedianSortedArrays(right, left);
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> singleProvider() {
        return Stream.of( //
                Arguments.of(new int[] { 2 }, new int[] {}, 2.0), //
                Arguments.of(new int[] { 2, 5, 7 }, new int[] {}, 5.0), //
                Arguments.of(new int[] { 2, 5, 7, 9 }, new int[] {}, 6.0), //
                Arguments.of(new int[] {}, new int[] { 2 }, 2.0) //
        );
    }

    @ParameterizedTest
    @MethodSource("singleProvider")
    void single(int[] left, int[] right, double expected) {
        double actual = instance.findMedianSortedArrays(left, right);
        assertThat(actual).isEqualTo(expected);
    }
}
