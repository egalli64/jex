package com.hackerrank.algorithms.implementation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FlatlandSpaceStationsTest {
    @Test
    void flatlandSpaceStationsSample0() {
        int nCities = 5;
        int[] stations = {0, 4};
        int expected = 2;
        int actual = FlatlandSpaceStations.flatlandSpaceStations(nCities, stations);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void flatlandSpaceStationsSample1() {
        int nCities = 6;
        int[] stations = {0, 1, 2, 4, 3, 5};
        int expected = 0;
        int actual = FlatlandSpaceStations.flatlandSpaceStations(nCities, stations);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}