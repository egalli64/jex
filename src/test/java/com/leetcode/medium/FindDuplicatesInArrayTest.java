/*
 * 442. Find All Duplicates in an Array - https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.List;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindDuplicatesInArrayTest {
    private static final FindDuplicatesInArray instance = new FindDuplicatesInArray();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }, new Integer[] { 2, 3 }), //
                Arguments.of(new int[] { 1, 1, 2 }, new Integer[] { 1 }), //
                Arguments.of(new int[] { 1 }, new Integer[] {}) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, Integer[] expected) {
        List<Integer> actual = instance.findDuplicates(input);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }
}
