package com.example.jex.other;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TrainingDayTest {
    @Test
    void given1() {
        String[] input = { "039", "4", "14", "32", "", "34", "7" };
        int expected = 5;

        assertThat(TrainingDay.solution(input)).isEqualTo(expected);
    }

    @Test
    void given2() {
        String[] input = { "801234567", "180234567", "0", "189234567", "891234567", "98", "9" };
        int expected = 7;

        assertThat(TrainingDay.solution(input)).isEqualTo(expected);
    }

    @Test
    void given3() {
        String[] input = { "5421", "245", "1452", "0345", "53", "354" };
        int expected = 6;

        assertThat(TrainingDay.solution(input)).isEqualTo(expected);
    }
}
