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

class Array6Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 6, 4 }, true), //
                Arguments.of(new int[] { 1, 4 }, false), //
                Arguments.of(new int[] { 6 }, true) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void array11Example1(int[] input, boolean expected) {
        assertThat(Array6.array6(input, 0)).isEqualTo(expected);
    }
}
