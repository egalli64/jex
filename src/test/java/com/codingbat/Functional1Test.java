package com.codingbat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Functional1Test {
    @Test
    void rightDigitOtherExample1() {
        List<Integer> input = Arrays.asList(1, 22, 93);
        List<Integer> expected = List.of(1, 2, 3);
        assertThat(Functional1.rightDigitOther(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void noXExample1() {
        List<String> input = Arrays.asList("ax", "bb", "cx");
        List<String> expected = List.of("a", "bb", "c");
        assertThat(Functional1.noX(input)).containsExactlyElementsOf(expected);
    }
}