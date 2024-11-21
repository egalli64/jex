/*
 * 1652. Defuse the Bomb - https://leetcode.com/problems/defuse-the-bomb/description/
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

class DefuseTheBombTest {
    private static final DefuseTheBomb instance = new DefuseTheBomb();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3, 4 }, 2, new int[] { 5, 7, 5, 3 }), //
                Arguments.of(new int[] { 1, 2, 3, 4 }, -2, new int[] { 7, 5, 3, 5 }), //
                Arguments.of(new int[] { 5, 7, 1, 4 }, 3, new int[] { 12, 10, 16, 13 }), //
                Arguments.of(new int[] { 1, 2, 3, 4 }, 0, new int[] { 0, 0, 0, 0 }), //
                Arguments.of(new int[] { 2, 4, 9, 3 }, -2, new int[] { 12, 5, 6, 13 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int span, int[] expected) {
        var actual = instance.decrypt(input, span);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examplesPartialSum(int[] input, int span, int[] expected) {
        var actual = instance.decryptPartialSum(input, span);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
