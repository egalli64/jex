package com.codingbat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Functional2Test {
    @Test
    void noZExample1() {
        List<String> input = List.of("aaa", "bbb", "aza");
        List<String> expected = List.of("aaa", "bbb");

        Assertions.assertThat(Functional2.noZ(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void noYYExample1() {
        List<String> input = List.of("a", "b", "c");
        List<String> expected = List.of("ay", "by", "cy");

        Assertions.assertThat(Functional2.noYY(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void noTeenExample1() {
        List<Integer> input = new ArrayList<>(List.of(12, 13, 19, 20));
        List<Integer> expected = List.of(12, 20);

        Assertions.assertThat(Functional2.noTeen(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void noLongExample1() {
        List<String> input = new ArrayList<>(List.of("this", "not", "too", "long"));
        List<String> expected = List.of("not", "too");

        Assertions.assertThat(Functional2.noLong(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void no34Example1() {
        List<String> input = new ArrayList<>(List.of("a", "bb", "ccc"));
        List<String> expected = List.of("a", "bb");

        Assertions.assertThat(Functional2.no34(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void two2Example1() {
        List<Integer> input = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> expected = List.of(4, 6);

        Assertions.assertThat(Functional2.two2(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void square56Example1() {
        List<Integer> input = new ArrayList<>(List.of(3, 1, 4));
        List<Integer> expected = List.of(19, 11);

        Assertions.assertThat(Functional2.square56(input)).containsExactlyElementsOf(expected);
    }
}