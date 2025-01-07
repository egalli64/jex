/*
 * 1408. String Matching in an Array - https://leetcode.com/problems/string-matching-in-an-array/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class StringMatchingInAnArrayTest {
    private static final StringMatchingInAnArray instance = new StringMatchingInAnArray();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[] {"mass","as","hero","superhero"}, List.of("as","hero")), //
                Arguments.of(new String[] {"leetcode","et","code"}, List.of("et","code")), //
                Arguments.of(new String[] {"blue","green","bu"}, List.of()) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] input, List<String> expected) {
        assertThat(instance.stringMatching(input)).containsAll(expected);
    }
}
