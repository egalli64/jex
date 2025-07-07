/*
 * 1353. Maximum Number of Events That Can Be Attended - https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/description/
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

class MaximumNumberOfEventsThatCanBeAttendedTest {
    private static final MaximumNumberOfEventsThatCanBeAttended instance = new MaximumNumberOfEventsThatCanBeAttended();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[][]{{1, 2}, {2, 3}, {3, 4}}, 3), //
                Arguments.of(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 2}}, 4) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] input, int expected) {
        var actual = instance.maxEvents(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
