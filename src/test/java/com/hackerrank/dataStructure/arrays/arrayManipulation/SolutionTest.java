/*
    Practice > Data Structures > Arrays > Array Manipulation
    https://www.hackerrank.com/challenges/crush/problem
    https://thisthread.blogspot.com/2021/02/hackerrank-array-manipulation.html
 */
package com.hackerrank.dataStructure.arrays.arrayManipulation;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void arrayManipulationProvided0() {
        int n = 5;
        int[][] queries = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};

        long actual = Solution.arrayManipulation(n, queries);
        long expected = 200;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void arrayManipulationProvided1() {
        int n = 10;
        int[][] queries = {{1, 5, 3}, {4, 8, 7}, {6, 9, 1}};

        long actual = Solution.arrayManipulation(n, queries);
        long expected = 10;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void arrayManipulationProvided2() {
        int n = 10;
        int[][] queries = {{2, 6, 8}, {3, 5, 7}, {1, 8, 1}, {5, 9, 15}};

        long actual = Solution.arrayManipulation(n, queries);
        long expected = 31;

        assertThat(actual).isEqualTo(expected);
    }
}