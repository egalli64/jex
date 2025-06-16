/*
 * 2016. Maximum Difference Between Increasing Elements - https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaximumDifferenceBetweenIncreasingElementsTest {
    private static final MaximumDifferenceBetweenIncreasingElements instance = new MaximumDifferenceBetweenIncreasingElements();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 7, 1, 5, 4 }, 4), //
                Arguments.of(new int[] { 9, 4, 3, 2 }, -1), //
                Arguments.of(new int[] { 1, 5, 2, 10 }, 9) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.maximumDifference(input);
        assertThat(actual).isEqualTo(expected);
    }
}
