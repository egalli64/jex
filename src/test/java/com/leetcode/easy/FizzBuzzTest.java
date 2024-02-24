/*
 * 412. Fizz Buzz - https://leetcode.com/problems/fizz-buzz/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import java.util.List;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FizzBuzzTest {
    private static final FizzBuzz instance = new FizzBuzz();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(3, List.of("1", "2", "Fizz")), //
                Arguments.of(5, List.of("1", "2", "Fizz", "4", "Buzz")), //
                Arguments.of(15, List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
                        "13", "14", "FizzBuzz")) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void fizzBuzzExamples(int n, List<String> expected) {
        List<String> actual = instance.fizzBuzz(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
