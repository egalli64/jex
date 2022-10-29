package com.hackerrank.algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AcmIcpcTeamTest {
    @Test
    void acmTeamOne() {
        List<String> input = List.of("10101", "11110", "00010");
        List<Integer> expected = List.of(5, 1);

        List<Integer> actual = AcmIcpcTeam.acmTeam(input);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void acmTeamTwo() {
        List<String> input = List.of("10101", "11100", "11010", "00101");
        List<Integer> expected = List.of(5, 2);

        List<Integer> actual = AcmIcpcTeam.acmTeam(input);
        assertThat(actual).isEqualTo(expected);
    }
}