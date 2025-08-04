/*
 * 904. Fruit Into Baskets - https://leetcode.com/problems/fruit-into-baskets/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FruitIntoBasketsTest {
    private static final FruitIntoBaskets instance = new FruitIntoBaskets();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[]{1, 2, 1}, 3), //
                Arguments.of(new int[]{0, 1, 2, 2}, 3), //
                Arguments.of(new int[]{1, 2, 3, 2, 2}, 4));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.totalFruit(input);
        assertThat(actual).isEqualTo(expected);
    }
}