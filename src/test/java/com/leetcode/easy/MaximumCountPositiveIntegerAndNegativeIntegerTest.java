/*
 * 2529. Maximum Count of Positive Integer and Negative Integer - https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/
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

class MaximumCountPositiveIntegerAndNegativeIntegerTest {
    private static final MaximumCountPositiveIntegerAndNegativeInteger instance = new MaximumCountPositiveIntegerAndNegativeInteger();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { -1 }, 1), //
                Arguments.of(new int[] { 0, 0, 0, 0, 0, 0, 0, 0 }, 0), //
                Arguments.of(new int[] { -1563, -236, -114, -55, 427, 447, 687, 752, 1021, 1636 }, 6), //
                Arguments.of(new int[] { -2, -1, -1, 1, 2, 3 }, 3), //
                Arguments.of(new int[] { -3, -2, -1, 0, 0, 1, 2 }, 3), //
                Arguments.of(new int[] { 5, 20, 66, 1314 }, 4) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.maximumCount(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
