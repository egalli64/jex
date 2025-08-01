/*
 * 118. Pascal's Triangle - https://leetcode.com/problems/pascals-triangle/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class PascalsTriangleTest {
    private static final PascalsTriangle instance = new PascalsTriangle();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(5, List.of(
                        List.of(1),
                        List.of(1, 1),
                        List.of(1, 2, 1),
                        List.of(1, 3, 3, 1),
                        List.of(1, 4, 6, 4, 1))),
                Arguments.of(1, List.of(
                        List.of(1)))
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int input, List<List<Integer>> expected) {
        var actual = instance.generate(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
