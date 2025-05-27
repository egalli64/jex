/*
 * 2894. Divisible and Non-divisible Sums Difference - https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DivisibleAndNonDivisibleSumsDifferenceTest {
    private static final DivisibleAndNonDivisibleSumsDifference instance = new DivisibleAndNonDivisibleSumsDifference();

    @ParameterizedTest
    @CsvSource({ "10,3,19", "5,6,15", "5,1,-15" })
    void examples(int left, int right, int expected) {
        assertThat(instance.differenceOfSums(left, right)).isEqualTo(expected);
    }
}
