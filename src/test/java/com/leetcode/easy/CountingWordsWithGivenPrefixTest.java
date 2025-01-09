package com.leetcode.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CountingWordsWithGivenPrefixTest {
    private static final CountingWordsWithGivenPrefix instance = new CountingWordsWithGivenPrefix();

    private static final Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new String[] { "pay", "attention", "practice", "attend" }, "at", 2), //
                Arguments.of(new String[] { "leetcode", "win", "loops", "success" }, "code", 0) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void examples(String[] words, String target, int expected) {
        assertThat(instance.prefixCount(words, target)).isEqualTo(expected);
    }
}
