package com.hackerrank.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class MarkToyTest {
    @Test
    void maximumToysGiven0() {
        int expected = 4;
        int actual = MarkToy.maximumToys(Arrays.asList(1, 12, 5, 111, 200, 1000, 10), 50);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void maximumToysGiven1() {
        int expected = 3;
        int actual = MarkToy.maximumToys(Arrays.asList(1, 2, 3, 4), 7);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void maximumToysGiven2() {
        int expected = 3;
        int actual = MarkToy.maximumToys(Arrays.asList(3, 7, 2, 9, 4), 15);

        assertThat(actual).isEqualTo(expected);
    }
}