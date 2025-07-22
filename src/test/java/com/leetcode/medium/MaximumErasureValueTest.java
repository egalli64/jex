package com.leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MaximumErasureValueTest {
    private static final MaximumErasureValue instance = new MaximumErasureValue();

    private static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[]{4, 2, 4, 5, 6}, 17), //
                Arguments.of(new int[]{5, 2, 1, 2, 5, 2, 1, 2, 5}, 8) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int expected) {
        int actual = instance.maximumUniqueSubarray(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
