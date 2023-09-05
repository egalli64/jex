package com.codingbat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Functional1Test {
    @Test
    void copies3Example1() {
        List<String> input = Arrays.asList("a", "bb", "ccc");
        List<String> expected = List.of("aaa", "bbbbbb", "ccccccccc");
        assertThat(Functional1.copies3(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void copies3Java11Example1() {
        List<String> input = Arrays.asList("a", "bb", "ccc");
        List<String> expected = List.of("aaa", "bbbbbb", "ccccccccc");
        assertThat(Functional1.copies3Java11(input)).containsExactlyElementsOf(expected);
    }

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
    void squareExample1() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = List.of(1, 4, 9);
        assertThat(Functional1.square(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void squareByMappingExample1() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = List.of(1, 4, 9);
        assertThat(Functional1.squareByMapping(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void addStarExample1() {
        List<String> input = Arrays.asList("a", "bb", "ccc");
        List<String> expected = List.of("a*", "bb*", "ccc*");
        assertThat(Functional1.addStar(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void moreYExample1() {
        List<String> input = Arrays.asList("a", "b", "c");
        List<String> expected = List.of("yay", "yby", "ycy");
        assertThat(Functional1.moreY(input)).containsExactlyElementsOf(expected);
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