/*
 * 3396. Minimum Number of Operations to Make Elements in Array Distinct - https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/description/
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

class MinimumNumberOfOperationsToMakeElementsInArrayDistinctTest {
    private static final MinimumNumberOfOperationsToMakeElementsInArrayDistinct instance = new MinimumNumberOfOperationsToMakeElementsInArrayDistinct();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 3, 4, 2, 3, 3, 5, 7 }, 2), //
                Arguments.of(new int[] { 4, 5, 6, 4, 4 }, 2), //
                Arguments.of(new int[] { 6, 7, 8, 9 }, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.minimumOperations(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
