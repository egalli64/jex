/*
 * 26. Remove Duplicates from Sorted Array - https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveDuplicatesFromSortedArrayTest {
    private static final RemoveDuplicatesFromSortedArray instance = new RemoveDuplicatesFromSortedArray();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 1, 2 }, new int[] { 1, 2 }, 2), //
                Arguments.of(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }, new int[] { 0, 1, 2, 3, 4 }, 5) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int[] expected, int k) {
        int actual = instance.removeDuplicates(input);
        assertThat(actual).isEqualTo(k);

        int[] cut = Arrays.copyOf(input, k);
        assertThat(cut).isEqualTo(expected);
    }
}
