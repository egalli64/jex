/*
    Practice > Data Structures > Arrays > Array Manipulation
    https://www.hackerrank.com/challenges/crush/problem
    https://thisthread.blogspot.com/2021/02/hackerrank-array-manipulation.html
 */
package hr.dataStructure.arrays.arrayManipulation;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class SolutionTest {

    @Test
    void arrayManipulationProvided0() {
        int n = 5;
        int[][] queries = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};

        long actual = Solution.arrayManipulation(n, queries);
        long expected = 200;

        assertThat(actual, is(expected));
    }

    @Test
    void arrayManipulationProvided1() {
        int n = 10;
        int[][] queries = {{1, 5, 3}, {4, 8, 7}, {6, 9, 1}};

        long actual = Solution.arrayManipulation(n, queries);
        long expected = 10;

        assertThat(actual, is(expected));
    }

    @Test
    void arrayManipulationProvided2() {
        int n = 10;
        int[][] queries = {{2, 6, 8}, {3, 5, 7}, {1, 8, 1}, {5, 9, 15}};

        long actual = Solution.arrayManipulation(n, queries);
        long expected = 31;

        assertThat(actual, is(expected));
    }
}