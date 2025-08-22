/*
 * 3195. Find the Minimum Area to Cover All Ones I - https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FindTheMinimumAreaToCoverAllOnesITest {
    private static final FindTheMinimumAreaToCoverAllOnesI instance = new FindTheMinimumAreaToCoverAllOnesI();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[][]{{0, 1, 0}, {1, 0, 1}}, 6), //
                Arguments.of(new int[][]{{1, 0}, {0, 0}}, 1) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] input, int expected) {
        int actual = instance.minimumArea(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}