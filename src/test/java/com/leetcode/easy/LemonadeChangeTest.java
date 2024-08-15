/*
 * 860. Lemonade Change - https://leetcode.com/problems/lemonade-change/description/
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

class LemonadeChangeTest {
    private static final LemonadeChange instance = new LemonadeChange();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 5, 5, 5, 10, 20 }, true), //
                Arguments.of(new int[] { 5, 5, 10, 10, 20 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, boolean expected) {
        var actual = instance.lemonadeChange(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
