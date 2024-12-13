/*
 * 2593. Find Score of an Array After Marking All Elements - https://leetcode.com/problems/find-score-of-an-array-after-marking-all-elements/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindScoreOfAnArrayAfterMarkingAllElementsTest {
    private static final FindScoreOfAnArrayAfterMarkingAllElements instance = new FindScoreOfAnArrayAfterMarkingAllElements();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 1, 3, 4, 5, 2 }, 7), //
                Arguments.of(new int[] { 2, 3, 5, 1, 3, 2 }, 5) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, long expected) {
        long actual = instance.findScore(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
