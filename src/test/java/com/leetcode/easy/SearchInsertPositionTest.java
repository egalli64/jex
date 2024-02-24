/*
 * 35. Search Insert Position - https://leetcode.com/problems/search-insert-position/description/
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

class SearchInsertPositionTest {
    private static final SearchInsertPosition instance = new SearchInsertPosition();

    static Stream<Arguments> provider() {
        final int[] input = { 1, 3, 5, 6 };
        return Stream.of( //
                Arguments.of(input, 5, 2), //
                Arguments.of(input, 2, 1), //
                Arguments.of(input, 7, 4), //
                Arguments.of(input, 0, 0), //
                Arguments.of(new int[] { 1 }, 0, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int target, int expected) {
        int actual = instance.searchInsert(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
