package com.codingbat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Map2Test {
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