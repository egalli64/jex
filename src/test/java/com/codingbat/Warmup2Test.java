package com.codingbat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Warmup2Test {
    @Test
    void noTriplesExample1() {
        int[] input = { 1, 1, 2, 2, 1 };
        assertThat(Warmup2.noTriples(input)).isTrue();
    }

    @Test
    void has271Example1() {
        int[] input = { 1, 2, 7, 1 };
        assertThat(Warmup2.has271(input)).isTrue();
    }
}