package com.codingbat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Functional1Test {
    @Test
    void rightDigitExample1() {
        List<Integer> input = Arrays.asList(1, 22, 93);
        List<Integer> expected = List.of(1, 2, 3);
        assertThat(Functional1.rightDigit(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void rightDigitOtherExample1() {
        List<Integer> input = Arrays.asList(1, 22, 93);
        List<Integer> expected = List.of(1, 2, 3);
        assertThat(Functional1.rightDigitOther(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void math1Example1() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = List.of(20, 30, 40);
        assertThat(Functional1.math1(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void lowerExample1() {
        List<String> input = Arrays.asList("Hello", "Hi");
        List<String> expected = List.of("hello", "hi");
        assertThat(Functional1.lower(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void noXExample1() {
        List<String> input = Arrays.asList("ax", "bb", "cx");
        List<String> expected = List.of("a", "bb", "c");
        assertThat(Functional1.noX(input)).containsExactlyElementsOf(expected);
    }
}