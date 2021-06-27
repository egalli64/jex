package hr.dataStructure.trees.swapNodes;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void swapNodesGiven0() {
        int[][] indices = {{2, 3}, {-1, -1}, {-1, -1}};
        int[] queries = {1, 1};

        int[][] expected = {{3, 1, 2}, {2, 1, 3}};
        int[][] actual = Solution.swapNodes(indices, queries);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapNodesGiven1() {
        int[][] indices = {
                {2, 3}, {4, 5}, {6, -1}, {-1, 7}, {8, 9}, {10, 11}, {12, 13}, {-1, 14}, {-1, -1},
                {15, -1}, {16, 17}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}
        };
        int[] queries = {2, 3};

        int[][] expected = {
                {14, 8, 5, 9, 2, 4, 13, 7, 12, 1, 3, 10, 15, 6, 17, 11, 16},
                {9, 5, 14, 8, 2, 13, 7, 12, 4, 1, 3, 17, 11, 16, 6, 10, 15}
        };
        int[][] actual = Solution.swapNodes(indices, queries);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void swapNodesGiven2() {
        int[][] indices = {
                {2, 3}, {4, -1}, {5, -1}, {6, -1}, {7, 8}, {-1, 9},
                {-1, -1}, {10, 11}, {-1, -1}, {-1, -1}, {-1, -1},
        };
        int[] queries = {2, 4};

        int[][] expected = {
                {2, 9, 6, 4, 1, 3, 7, 5, 11, 8, 10},
                {2, 6, 9, 4, 1, 3, 7, 5, 10, 8, 11}
        };
        int[][] actual = Solution.swapNodes(indices, queries);
        assertThat(actual).isEqualTo(expected);
    }
}