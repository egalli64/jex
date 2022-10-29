package com.codingbat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

class Map2Test {
    @Test
    void word0Example1() {
        String[] input = { "a", "b", "a", "b" };
        Map<String, Integer> expected = Map.of("a", 0, "b", 0);

        Assertions.assertThat(Map2.word0(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void wordCountExample1() {
        String[] input = { "a", "b", "a", "c", "b" };
        Map<String, Integer> expected = Map.of("a", 2, "b", 2, "c", 1);

        Assertions.assertThat(Map2.wordCount(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void wordMultipleExample1() {
        String[] input = { "a", "b", "a", "c", "b" };
        Map<String, Boolean> expected = Map.of("a", true, "b", true, "c", false);

        Assertions.assertThat(Map2.wordMultiple(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void wordLenExample1() {
        String[] input = { "a", "bb", "a", "bb" };
        Map<String, Integer> expected = Map.of("bb", 2, "a", 1);

        Assertions.assertThat(Map2.wordLen(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void pairsExample1() {
        String[] input = { "code", "bug" };
        Map<String, String> expected = Map.of("b", "g", "c", "e");

        Assertions.assertThat(Map2.pairs(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void firstCharExample1() {
        String[] input = { "salt", "tea", "soda", "toast" };
        Map<String, String> expected = Map.of("s", "saltsoda", "t", "teatoast");

        Assertions.assertThat(Map2.firstChar(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void wordAppendExample1() {
        String[] input = { "a", "b", "a" };
        String expected = "a";

        Assertions.assertThat(Map2.wordAppend(input)).isEqualTo(expected);
    }

    @Test
    void allSwapExample1() {
        String[] input = { "ab", "ac" };
        String[] expected = { "ac", "ab" };

        Assertions.assertThat(Map2.allSwap(input)).isEqualTo(expected);
    }

    @Test
    void allSwapExample2() {
        String[] input = { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" };
        String[] expected = { "ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa" };

        Assertions.assertThat(Map2.allSwap(input)).isEqualTo(expected);
    }

    @Test
    void firstSwapExample1() {
        String[] input = { "ab", "ac" };
        String[] expected = { "ac", "ab" };

        Assertions.assertThat(Map2.firstSwap(input)).isEqualTo(expected);
    }

    @Test
    void firstSwapExample2() {
        String[] input = { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" };
        String[] expected = { "ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz" };

        Assertions.assertThat(Map2.firstSwap(input)).isEqualTo(expected);
    }

}