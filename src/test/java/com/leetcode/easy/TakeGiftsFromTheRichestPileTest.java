/*
 * 2558. Take Gifts From the Richest Pile - https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/
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

class TakeGiftsFromTheRichestPileTest {
    private static final TakeGiftsFromTheRichestPile instance = new TakeGiftsFromTheRichestPile();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 25, 64, 9, 4, 100 }, 4, 29), //
                Arguments.of(new int[] { 1, 1, 1, 1 }, 4, 4) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int counter, long expected) {
        long actual = instance.pickGifts(input, counter);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
