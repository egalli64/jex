/*
CodingBat Map 2 - https://codingbat.com/java/Map-2

My repository with solutions - https://github.com/egalli64/jex/
*/
package com.codingbat.map2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FirstSwapTest {
    static Stream<Arguments> provider() {
        String[] input1 = { "ab", "ac" };
        String[] expected1 = { "ac", "ab" };

        String[] input2 = { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" };
        String[] expected2 = { "ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz" };

        String[] input3 = { "ax", "bx", "ay", "by", "ai", "aj", "bx", "by" };
        String[] expected3 = { "ay", "by", "ax", "bx", "ai", "aj", "bx", "by" };

        return Stream.of( //
                Arguments.of(input1, expected1), //
                Arguments.of(input2, expected2), //
                Arguments.of(input3, expected3) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(String[] input, String[] expected) {
        assertThat(FirstSwap.solution(input)).isEqualTo(expected);
    }
}
