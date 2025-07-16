/*
 * 950. Reveal Cards In Increasing Order - https://leetcode.com/problems/reveal-cards-in-increasing-order/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RevealCardsInIncreasingOrderTest {
    private static final RevealCardsInIncreasingOrder instance = new RevealCardsInIncreasingOrder();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 17, 13, 11, 2, 3, 5, 7 }, new int[] { 2, 13, 3, 11, 5, 17, 7 }), //
                Arguments.of(new int[] { 1, 1000 }, new int[] { 1, 1000 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int[] expected) {
        int[] actual = instance.deckRevealedIncreasing(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
