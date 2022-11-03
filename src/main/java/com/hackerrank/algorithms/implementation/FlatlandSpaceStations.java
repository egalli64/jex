/*
    Prepare > Algorithms > Implementation > Flatland Space Stations
    https://www.hackerrank.com/challenges/flatland-space-stations/problem

    Given n cities, numbered 0 ... n-1, distanced 1 km from each other
    At least one city has a space station, reported in an unordered array of indices

    Return the maximum distance from a space station
 */
package com.hackerrank.algorithms.implementation;

import java.util.Arrays;

public class FlatlandSpaceStations {
    static int flatlandSpaceStations(int n, int[] c) {
        // full serviced flatland
        if (c.length == n) {
            return 0;
        }

        Arrays.sort(c);

        // check outer cities
        int result = Math.max(c[0], n - 1 - c[c.length - 1]);

        // check the internal cities
        for (int i = 0; i < c.length - 1; i++) {
            result = Math.max(result, (c[i + 1] - c[i]) / 2);
        }
        return result;
    }
}
