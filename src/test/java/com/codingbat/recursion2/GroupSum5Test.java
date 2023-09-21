/*
  CodingBat Java Recursion 2 - https://codingbat.com/java/Recursion-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GroupSum5Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 5, 10, 4 }, 19, true), //
                Arguments.of(new int[] { 2, 5, 10, 4 }, 17, true), //
                Arguments.of(new int[] { 2, 5, 10, 4 }, 12, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void groupSum5Examples(int[] data, int target, boolean expected) {
        assertThat(GroupSum5.groupSum5(0, data, target)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void alternativeExamples(int[] data, int target, boolean expected) {
        assertThat(GroupSum5.alternative(0, data, target)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void noStartExamples(int[] data, int target, boolean expected) {
        assertThat(GroupSum5.groupSum5(data, target)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void checkStartExamples(int[] data, int target, boolean expected) {
        assertThat(GroupSum5.checkStart(0, data, target)).isEqualTo(expected);
    }

    static Stream<Arguments> oneProvider() {
        return Stream.of( //
                Arguments.of(new int[] { 3, 5, 1 }, 4, false), //
                Arguments.of(new int[] { 3, 5, 1 }, 5, true), //
                Arguments.of(new int[] { 3, 5, 1 }, 9, false), //
                Arguments.of(new int[] { 1, 3, 5 }, 8, true) //
        );
    }

    @ParameterizedTest
    @MethodSource("oneProvider")
    void groupSum5One(int[] data, int target, boolean expected) {
        assertThat(GroupSum5.groupSum5(0, data, target)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("oneProvider")
    void noStartOne(int[] data, int target, boolean expected) {
        assertThat(GroupSum5.groupSum5(data, target)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("oneProvider")
    void checkStartOne(int[] data, int target, boolean expected) {
        assertThat(GroupSum5.checkStart(0, data, target)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("oneProvider")
    void alternativeOne(int[] data, int target, boolean expected) {
        assertThat(GroupSum5.alternative(0, data, target)).isEqualTo(expected);
    }
}
