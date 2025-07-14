/*
 * 1791. Find Center of Star Graph - https://leetcode.com/problems/find-center-of-star-graph/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class StarGraphCenterTest {
    private static final StarGraphCenter instance = new StarGraphCenter();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[][] { { 1, 2 }, { 2, 3 }, { 4, 2 } }, 2), //
                Arguments.of(new int[][] { { 1, 2 }, { 5, 1 }, { 1, 3 }, { 1, 4 } }, 1) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] input, int expected) {
        int actual = instance.findCenter(input);
        assertThat(actual).isEqualTo(expected);
    }
}
