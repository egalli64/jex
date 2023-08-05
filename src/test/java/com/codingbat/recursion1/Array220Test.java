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

class Array220Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 20 }, true), //
                Arguments.of(new int[] { 3, 30 }, true), //
                Arguments.of(new int[] { 3 }, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void array220Examples(int[] input, boolean expected) {
        assertThat(Array220.array220(input, 0)).isEqualTo(expected);
    }
}
