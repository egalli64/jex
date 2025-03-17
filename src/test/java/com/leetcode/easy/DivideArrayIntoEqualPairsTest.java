/*
 * 2206. Divide Array Into Equal Pairs - https://leetcode.com/problems/divide-array-into-equal-pairs/description/
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

class DivideArrayIntoEqualPairsTest {
    private static final DivideArrayIntoEqualPairs instance = new DivideArrayIntoEqualPairs();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 3, 2, 3, 2, 2, 2 }, true), //
                Arguments.of(new int[] { 1, 2, 3, 4 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, boolean expected) {
        var actual = instance.divideArray(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
