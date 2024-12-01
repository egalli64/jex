/*
 * 1346. Check If N and Its Double Exist - https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
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

class CheckIfNAndItsDoubleExistTest {
    private static final CheckIfNAndItsDoubleExist instance = new CheckIfNAndItsDoubleExist();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 10, 2, 5, 3 }, true), //
                Arguments.of(new int[] { 3, 1, 7, 11 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, boolean expected) {
        var actual = instance.checkIfExist(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
