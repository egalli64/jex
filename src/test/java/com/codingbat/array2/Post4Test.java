/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Post4Test {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 2, 4, 1, 2 }, new int[] { 1, 2 }), //
                Arguments.of(new int[] { 4, 1, 4, 2 }, new int[] { 2 }), //
                Arguments.of(new int[] { 4, 4, 1, 2, 3 }, new int[] { 1, 2, 3 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, int[] expected) {
        assertThat(Post4.solution(data)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void verboseExamples(int[] data, int[] expected) {
        assertThat(Post4.verbose(data)).isEqualTo(expected);
    }
}
