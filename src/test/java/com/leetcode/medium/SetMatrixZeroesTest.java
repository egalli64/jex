/*
 * 73. Set Matrix Zeroes - https://leetcode.com/problems/set-matrix-zeroes/description/
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

class SetMatrixZeroesTest {
    private static final SetMatrixZeroes instance = new SetMatrixZeroes();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } },
                        new int[][] { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } }), //
                Arguments.of(new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } },
                        new int[][] { { 0, 0, 0, 0 }, { 0, 4, 5, 0 }, { 0, 3, 1, 0 } }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] input, int[][] expected) {
        instance.setZeroes(input);
        Assertions.assertThat(input).isEqualTo(expected);
    }
    

    @ParameterizedTest
    @MethodSource("provider")
    void extraMem(int[][] input, int[][] expected) {
        instance.extraMem(input);
        Assertions.assertThat(input).isEqualTo(expected);
    }
}
