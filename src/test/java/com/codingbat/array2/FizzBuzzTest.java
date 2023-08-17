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

class FizzBuzzTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(1, 6, new String[] { "1", "2", "Fizz", "4", "Buzz" }), //
                Arguments.of(1, 8, new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7" }), //
                Arguments.of(7, 11, new String[] { "7", "8", "Fizz", "Buzz" }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int begin, int end, String[] expected) {
        assertThat(FizzBuzz.solution(begin, end)).isEqualTo(expected);
    }
}
