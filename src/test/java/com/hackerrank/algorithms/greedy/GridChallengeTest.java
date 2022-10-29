package com.hackerrank.algorithms.greedy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class GridChallengeTest {
    @Test
    void gridChallengeCase0() {
        List<String> input = List.of("ebacd", "fghij", "olmkn", "trpqs", "xywuv");
        String actual = GridChallenge.gridChallenge(input);
        Assertions.assertThat(actual).isEqualTo("YES");
    }

    @Test
    void gridChallengeCase1a() {
        List<String> input = List.of("abc", "lmp", "qrt");
        String actual = GridChallenge.gridChallenge(input);
        Assertions.assertThat(actual).isEqualTo("YES");
    }

    @Test
    void gridChallengeCase1b() {
        List<String> input = List.of("mpxz", "abcd", "wlmf");
        String actual = GridChallenge.gridChallenge(input);
        Assertions.assertThat(actual).isEqualTo("NO");
    }

    @Test
    void gridChallengeCase1c() {
        List<String> input = List.of("abc", "hjk", "mpq", "rtv");
        String actual = GridChallenge.gridChallenge(input);
        Assertions.assertThat(actual).isEqualTo("YES");
    }
}