/*
 * 1920. Build Array from Permutation - https://leetcode.com/problems/build-array-from-permutation/description/
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

class BuildArrayFromPermutationTest {
    private static final BuildArrayFromPermutation instance = new BuildArrayFromPermutation();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 0, 2, 1, 5, 3, 4 }, new int[] { 0, 1, 2, 4, 5, 3 }), //
                Arguments.of(new int[] { 5, 0, 1, 2, 3, 4 }, new int[] { 4, 5, 0, 1, 2, 3 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int[] expected) {
        var actual = instance.buildArray(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
