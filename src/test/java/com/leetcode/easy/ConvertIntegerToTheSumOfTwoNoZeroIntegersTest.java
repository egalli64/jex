/*
 * 1317. Convert Integer to the Sum of Two No-Zero Integers - https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ConvertIntegerToTheSumOfTwoNoZeroIntegersTest {
    private static final ConvertIntegerToTheSumOfTwoNoZeroIntegers instance = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();

    @ParameterizedTest
    @ValueSource(ints = {2, 11, 10000})
    void examples(int input) {
        int[] actual = instance.getNoZeroIntegers(input);
        assertThat(actual.length).isEqualTo(2);
        assertThat(actual[0]).matches(this::isNoZero, "First element should be no-zero");
        assertThat(actual[1]).matches(this::isNoZero, "Second element should be no-zero");

        int sum = Arrays.stream(actual).sum();
        assertThat(sum).isEqualTo(input);
    }

    private boolean isNoZero(int value) {
        if (value <= 0) {
            return false;
        }

        while (value > 0) {
            if (value % 10 == 0) {
                return false;
            } else {
                value /= 10;
            }
        }

        return true;
    }
}