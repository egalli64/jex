package com.leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FindLuckyIntegerInArrayTest {
    private static final FindLuckyIntegerInArray instance = new FindLuckyIntegerInArray();

    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[]{2, 2, 3, 4}, 2), //
                Arguments.of(new int[]{1, 2, 2, 3, 3, 3}, 3), //
                Arguments.of(new int[]{2, 2, 2, 3, 3}, -1) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        var actual = instance.findLucky(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}