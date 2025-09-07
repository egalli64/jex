/*
 * 1304. Find N Unique Integers Sum up to Zero - https://leetcode.com/problems/add-binary/find-n-unique-integers-sum-up-to-zero/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class FindNUniqueIntegersSumUpToZeroTest {
    private static final FindNUniqueIntegersSumUpToZero instance = new FindNUniqueIntegersSumUpToZero();

    @ParameterizedTest
    @ValueSource(ints = {5, 3, 1})
    void examples(int input) {
        int[] actual = instance.sumZero(input);
        assertThat(actual.length).isEqualTo(input);

        Set<Integer> set = Arrays.stream(actual).boxed().collect(Collectors.toSet());
        assertThat(set.size()).isEqualTo(input);

        int sum = Arrays.stream(actual).sum();
        assertThat(sum).isZero();
    }
}
