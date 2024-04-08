/*
 * 1700. Number of Students Unable to Eat Lunch - https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/
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

class NumberOfStudentsUnableToEatLunchTest {
    private static final NumberOfStudentsUnableToEatLunch instance = new NumberOfStudentsUnableToEatLunch();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 1, 0, 0 }, new int[] { 0, 1, 0, 1 }, 0), //
                Arguments.of(new int[] { 1, 1, 1, 0, 0, 1 }, new int[] { 1, 0, 0, 0, 1, 1 }, 3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] students, int[] sandwiches, int expected) {
        int actual = instance.countStudents(students, sandwiches);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
