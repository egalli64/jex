/*
 * 2410. Maximum Matching of Players With Trainers - https://leetcode.com/problems/maximum-matching-of-players-with-trainers/description/
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

class MaximumMatchingOfPlayersWithTrainersTest {
    private static final MaximumMatchingOfPlayersWithTrainers instance = new MaximumMatchingOfPlayersWithTrainers();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[]{4, 7, 9}, new int[]{8, 2, 5, 8}, 2), //
                Arguments.of(new int[]{1, 1, 1}, new int[]{10}, 1) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] players, int[] trainers, int expected) {
        var actual = instance.matchPlayersAndTrainers(players, trainers);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
