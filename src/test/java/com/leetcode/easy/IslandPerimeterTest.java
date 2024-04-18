/*
 * 463. Island Perimeter - https://leetcode.com/problems/island-perimeter/description/
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

class IslandPerimeterTest {
    private static final IslandPerimeter instance = new IslandPerimeter();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } }, 16), //
                Arguments.of(new int[][] { { 1 } }, 4), //
                Arguments.of(new int[][] { { 1, 0 } }, 4) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] input, int expected) {
        int actual = instance.islandPerimeter(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
