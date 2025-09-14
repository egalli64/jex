/*
 * 966. Vowel Spellchecker - https://leetcode.com/problems/vowel-spellchecker/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class VowelSpellcheckerTest {
    private static final VowelSpellchecker instance = new VowelSpellchecker();

    private static Stream<Arguments> provider() {
        return Stream.of(Arguments.of(new String[]{"KiTe", "kite", "hare", "Hare"},
                        new String[]{"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"},
                        new String[]{"kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"}
                ),
                Arguments.of(new String[]{"yellow"}, new String[]{"YellOw"}, new String[]{"yellow"})
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] words, String[] queries, String[] expected) {
        var actual = instance.spellchecker(words, queries);
        assertThat(actual).isEqualTo(expected);
    }
}
