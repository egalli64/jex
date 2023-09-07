/*
  CodingBat Functional 1 - https://codingbat.com/java/Functional-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.functional1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LowerTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(Arrays.asList("Hello", "Hi"), List.of("hello", "hi")), //
                Arguments.of(Arrays.asList("AAA", "BBB", "ccc"), List.of("aaa", "bbb", "ccc")), //
                Arguments.of(Arrays.asList("KitteN", "ChocolaTE"), List.of("kitten", "chocolate")) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(List<String> input, List<String> expected) {
        assertThat(Lower.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceExamples(List<String> input, List<String> expected) {
        assertThat(Lower.inPlace(input)).isEqualTo(expected);
        assertThat(input).isEqualTo(expected);
    }
}
