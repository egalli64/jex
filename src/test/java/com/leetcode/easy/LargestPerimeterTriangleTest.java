/*
 * 976. Largest Perimeter Triangle - https://leetcode.com/problems/largest-perimeter-triangle/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LargestPerimeterTriangleTest {
    private static final LargestPerimeterTriangle instance = new LargestPerimeterTriangle();

    static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3, 4}, 10),
                Arguments.of(new int[]{2, 1, 2}, 5),
                Arguments.of(new int[]{1, 2, 1, 10}, 0));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.largestPerimeter(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}