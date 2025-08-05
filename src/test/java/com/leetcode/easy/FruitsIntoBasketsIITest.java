/*
 * 3477. Fruits Into Baskets II - https://leetcode.com/problems/fruits-into-baskets-ii/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FruitsIntoBasketsIITest {
    private static final FruitsIntoBasketsII instance = new FruitsIntoBasketsII();

    static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(new int[]{4, 2, 5}, new int[]{3, 5, 4}, 1),
                Arguments.of(new int[]{3, 6, 1}, new int[]{6, 4, 7}, 0));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] source, int[] sink, int expected) {
        var actual = instance.numOfUnplacedFruits(source, sink);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
