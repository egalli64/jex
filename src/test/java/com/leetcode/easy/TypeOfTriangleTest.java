/*
 * 3024. Type of Triangle - https://leetcode.com/problems/type-of-triangle/description/
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

class TypeOfTriangleTest {
    private static final TypeOfTriangle instance = new TypeOfTriangle();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 3, 3, 3 }, "equilateral"), //
                Arguments.of(new int[] { 3, 4, 5 }, "scalene") //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, String expected) {
        var actual = instance.triangleType(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void byOrdering(int[] input, String expected) {
        var actual = instance.byOrdering(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
