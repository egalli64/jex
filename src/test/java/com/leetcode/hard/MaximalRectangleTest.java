/*
 * 85. Maximal Rectangle - https://leetcode.com/problems/maximal-rectangle/description/
 * LeetCode Hard Problems - https://leetcode.com/problemset/?difficulty=HARD
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.hard;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaximalRectangleTest {
    private static final MaximalRectangle instance = new MaximalRectangle();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new char[][] { //
                        { '1', '0', '1', '0', '0' }, //
                        { '1', '0', '1', '1', '1' }, //
                        { '1', '1', '1', '1', '1' }, //
                        { '1', '0', '0', '1', '0' } }, 6), //
                Arguments.of(new char[][] { { '0' } }, 0), //
                Arguments.of(new char[][] { { '1' } }, 1) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(char[][] input, int expected) {
        int actual = instance.maximalRectangle(input);
        assertThat(actual).isEqualTo(expected);
    }
}
