/*
 * 2418. Sort the People - https://leetcode.com/problems/sort-the-people/description/
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

class SortThePeopleTest {
    private static final SortThePeople instance = new SortThePeople();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[] { "Mary", "John", "Emma" }, new int[] { 180, 165, 170 },
                        new String[] { "Mary", "Emma", "John" }), //
                Arguments.of(new String[] { "Alice", "Bob", "Bob" }, new int[] { 155, 185, 150 },
                        new String[] { "Bob", "Alice", "Bob" }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] names, int[] heights, String[] expected) {
        String[] actual = instance.sortPeople(names, heights);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
