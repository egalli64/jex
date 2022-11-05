package com.hackerrank.algorithms.implementation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class OrganizingContainersOfBallsTest {
    @Test
    void organizingContainersExample() {
        var input = List.of(List.of(1, 4), List.of(2, 3));
        String actual = OrganizingContainersOfBalls.organizingContainers(input);
        String expected = "Impossible";
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void organizingContainersSample01() {
        var input = List.of(List.of(1, 1), List.of(1, 1));
        String actual = OrganizingContainersOfBalls.organizingContainers(input);
        String expected = "Possible";
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void organizingContainersSample02() {
        var input = List.of(List.of(0, 2), List.of(1, 1));
        String actual = OrganizingContainersOfBalls.organizingContainers(input);
        String expected = "Impossible";
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}