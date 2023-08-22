package com.codingbat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Recursion2Test {
    @Test
    void split53Example1() {
        int[] values = { 1, 1 };
        assertThat(Recursion2.split53(values)).isTrue();
    }
}