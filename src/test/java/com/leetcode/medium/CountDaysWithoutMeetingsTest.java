/*
 * 3169. Count Days Without Meetings - https://leetcode.com/problems/count-days-without-meetings/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CountDaysWithoutMeetingsTest {
    private static final CountDaysWithoutMeetings instance = new CountDaysWithoutMeetings();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(10, new int[][] { { 5, 7 }, { 1, 3 }, { 9, 10 } }, 2), //
                Arguments.of(5, new int[][] { { 2, 4 }, { 1, 3 } }, 1), //
                Arguments.of(6, new int[][] { { 1, 6 } }, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int n, int[][] meetings, int expected) {
        var actual = instance.countDays(n, meetings);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
