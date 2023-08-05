/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Array11Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 11 }, 1), //
                Arguments.of(new int[] { 11, 11 }, 2), //
                Arguments.of(new int[] { 1, 2, 3, 4 }, 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void array11Examples(int[] input, int expected) {
        assertThat(Array11.array11(input, 0)).isEqualTo(expected);
    }
}
