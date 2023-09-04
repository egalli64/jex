/*
  CodingBat Map 2 - https://codingbat.com/java/Map-2

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class WordMultipleTest {
    static Stream<Arguments> provider() {
        var expected1 = Map.of("a", true, "b", true, "c", false);
        var expected2 = Map.of("a", false, "b", false, "c", false);
        var expected3 = Map.of("c", true);

        return Stream.of( //
                Arguments.of(new String[] { "a", "b", "a", "c", "b" }, expected1), //
                Arguments.of(new String[] { "c", "b", "a" }, expected2), //
                Arguments.of(new String[] { "c", "c", "c", "c" }, expected3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] input, Map<String, Boolean> expected) {
        assertThat(WordMultiple.solution(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void verboseExamples(String[] input, Map<String, Boolean> expected) {
        assertThat(WordMultiple.verbose(input)).isEqualTo(expected);
    }
}
