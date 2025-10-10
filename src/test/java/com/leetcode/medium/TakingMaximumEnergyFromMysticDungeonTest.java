/*
 * 3147. Taking Maximum Energy From the Mystic Dungeon - https://leetcode.com/problems/taking-maximum-energy-from-the-mystic-dungeon/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TakingMaximumEnergyFromMysticDungeonTest {
    private static final TakingMaximumEnergyFromMysticDungeon instance = new TakingMaximumEnergyFromMysticDungeon();

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(new int[]{5, 2, -10, -5, 1}, 3, 3),
                Arguments.of(new int[]{-2, -3, -1}, 2, -1));
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(int[] input, int step, int expected) {
        var actual = instance.maximumEnergy(input, step);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}