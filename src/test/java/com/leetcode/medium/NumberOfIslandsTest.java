/*
 * 200. Number of Islands - https://leetcode.com/problems/number-of-islands/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NumberOfIslandsTest {
    private static final NumberOfIslands instance = new NumberOfIslands();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new char[][] { //
                        { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, //
                        { '1', '1', '0', '0', '0' }, { '0', '0', '0', '0', '0' } }, 1), //
                Arguments.of(new char[][] { //
                        { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, //
                        { '0', '0', '1', '0', '0' }, { '0', '0', '0', '1', '1' } }, 3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(char[][] input, int expected) {
        int actual = instance.numIslands(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
