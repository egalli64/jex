/*
 * 349. Intersection of Two Arrays - https://leetcode.com/problems/intersection-of-two-arrays/description/
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

class IntersectionOfTwoArraysTest {
    private static final IntersectionOfTwoArrays instance = new IntersectionOfTwoArrays();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }, new int[] { 2 }), //
                Arguments.of(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 }, new int[] { 9, 4 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] left, int[] right, int[] expected) {
        int[] actual = instance.intersection(left, right);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }
}
