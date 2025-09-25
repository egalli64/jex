/*
 * 120. Triangle - https://leetcode.com/problems/triangle/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {
    private static final Triangle instance = new Triangle();

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3)), 11),
                Arguments.of(List.of(List.of(-10)), -10));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(List<List<Integer>> input, int expected) {
        var actual = instance.minimumTotal(input);
        assertThat(actual).isEqualTo(expected);
    }
}
