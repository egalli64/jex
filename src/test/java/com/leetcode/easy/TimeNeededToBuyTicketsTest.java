/*
 * 2073. Time Needed to Buy Tickets - https://leetcode.com/problems/time-needed-to-buy-tickets/description/
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

class TimeNeededToBuyTicketsTest {
    private static final TimeNeededToBuyTickets instance = new TimeNeededToBuyTickets();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 3, 2 }, 2, 6), //
                Arguments.of(new int[] { 5, 1, 1, 1 }, 0, 8) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] queue, int pos, int expected) {
        int actual = instance.timeRequiredToBuy(queue, pos);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
