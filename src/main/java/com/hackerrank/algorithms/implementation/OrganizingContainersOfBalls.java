/*
    Prepare > Algorithms > Implementation > Organizing Containers of Balls
    https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem

    Given some containers
    Check if it is possible to swap balls so that
        Each container contains only balls of the same type
        No two balls of the same type are located in different containers
    Return Possible or Impossible
 */
package com.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class OrganizingContainersOfBalls {
    public static String organizingContainers(List<List<Integer>> container) {
        int[] sizes = new int[container.size()];
        int[] balls = new int[container.size()];
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes.length; j++) {
                sizes[i] += container.get(j).get(i);
                balls[i] += container.get(i).get(j);
            }
        }
        Arrays.sort(sizes);
        Arrays.sort(balls);

        return Arrays.equals(sizes, balls) ? "Possible" : "Impossible";
    }
}
