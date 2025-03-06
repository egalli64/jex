/*
 * 2965. Find Missing and Repeated Values - https://leetcode.com/problems/find-missing-and-repeated-values/description/
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

class FindMissingRepeatedValuesTest {
    private static final FindMissingRepeatedValues instance = new FindMissingRepeatedValues();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[][] { { 1, 3 }, { 2, 2 } }, new int[] { 2, 4 }), //
                Arguments.of(new int[][] { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } }, new int[] { 9, 5 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[][] input, int[] expected) {
        var actual = instance.findMissingAndRepeatedValues(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
