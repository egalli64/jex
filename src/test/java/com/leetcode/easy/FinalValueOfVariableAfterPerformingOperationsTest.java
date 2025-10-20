/*
 * 2011. Final Value of Variable After Performing Operations - https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FinalValueOfVariableAfterPerformingOperationsTest {
    private static final FinalValueOfVariableAfterPerformingOperations instance = new FinalValueOfVariableAfterPerformingOperations();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[]{"--X", "X++", "X++"}, 1),
                Arguments.of(new String[]{"++X", "++X", "X++"}, 3),
                Arguments.of(new String[]{"X++", "++X", "--X", "X--"}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] input, int expected) {
        var actual = instance.finalValueAfterOperations(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}