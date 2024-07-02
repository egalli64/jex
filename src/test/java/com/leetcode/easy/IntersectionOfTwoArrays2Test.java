/*
 * 350. Intersection of Two Arrays II - https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
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

class IntersectionOfTwoArrays2Test {
    private static final IntersectionOfTwoArrays2 instance = new IntersectionOfTwoArrays2();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }, new int[] { 2, 2 }), //
                Arguments.of(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 }, new int[] { 4, 9 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] left, int[] right, int[] expected) {
        var actual = instance.intersect(left, right);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }
}
