package com.hackerrank.algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BeautifulTripletsTest {
    @Test
    void beautifulTripletsSample() {
        int gap = 3;
        List<Integer> input = List.of(1, 2, 4, 5, 7, 8, 10);
        int actual = BeautifulTriplets.beautifulTriplets(gap, input);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void beautifulTripletsDuplicates() {
        int gap = 1;
        List<Integer> input = List.of(2, 2, 3, 4, 5);
        int actual = BeautifulTriplets.beautifulTriplets(gap, input);
        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }
}