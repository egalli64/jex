/*
 * 1550. Three Consecutive Odds - https://leetcode.com/problems/three-consecutive-odds/description/
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

class ThreeConsecutiveOddsTest {
    private static final ThreeConsecutiveOdds instance = new ThreeConsecutiveOdds();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 6, 4, 1 }, false), //
                Arguments.of(new int[] { 1, 2, 34, 3, 4, 5, 7, 23, 12 }, true), //
                Arguments.of(new int[] { 1, 3, 5 }, true) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, boolean expected) {
        boolean actual = instance.threeConsecutiveOdds(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
