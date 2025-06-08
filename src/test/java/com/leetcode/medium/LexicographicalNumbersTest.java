/*
 * 386. Lexicographical Numbers - https://leetcode.com/problems/lexicographical-numbers/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LexicographicalNumbersTest {
    private static final LexicographicalNumbers instance = new LexicographicalNumbers();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(13, List.of(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9)), //
                Arguments.of(2, List.of(1, 2)) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int input, List<Integer> expected) {
        assertThat(instance.lexicalOrder(input)).isEqualTo(expected);
    }
}
