/*
 * 2601. Prime Subtraction Operation - https://leetcode.com/problems/prime-subtraction-operation/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PrimeSubtractionOperationTest {
    private static final PrimeSubtractionOperation instance = new PrimeSubtractionOperation();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 4, 9, 6, 10 }, true), //
                Arguments.of(new int[] { 6, 8, 11, 12 }, true), //
                Arguments.of(new int[] { 5, 8, 3 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, boolean expected) {
        boolean actual = instance.primeSubOperation(input);
        assertThat(actual).isEqualTo(expected);
    }
}
