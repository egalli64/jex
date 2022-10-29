package com.hackerrank.algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CavityMapTest {
    @Test
    void cavityMapExample() {
        List<String> input = List.of("989", "191", "111");
        List<String> expected = List.of("989", "1X1", "111");
        List<String> actual = CavityMap.cavityMap(input);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void cavityMap1() {
        List<String> input = List.of("9");
        List<String> expected = List.of("9");
        List<String> actual = CavityMap.cavityMap(input);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void cavityMap2() {
        List<String> input = List.of("98", "19");
        List<String> expected = List.of("98", "19");
        List<String> actual = CavityMap.cavityMap(input);
        assertThat(actual).isEqualTo(expected);
    }

}