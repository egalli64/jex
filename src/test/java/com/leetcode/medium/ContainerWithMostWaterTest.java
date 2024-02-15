/*
 * LeetCode 11. Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/description/
 * 
 * My repository with solutions
 * https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ContainerWithMostWaterTest {
    private static final ContainerWithMostWater instance = new ContainerWithMostWater();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }, 49), //
                Arguments.of(new int[] { 1, 1 }, 1), //
                Arguments.of(new int[] { 1, 2, 4, 3 }, 4) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void maxAreaExamples(int[] input, int expected) {
        int actual = instance.maxArea(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
