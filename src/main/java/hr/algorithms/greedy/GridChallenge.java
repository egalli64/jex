/*
 * Prepare > Algorithms > Greedy > Grid Challenge
 * https://www.hackerrank.com/challenges/grid-challenge/
 *
 * Given a list of strings of same length
 * return YES if it is possible to sort the strings both horizontally and vertically, NO otherwise
 */
package hr.algorithms.greedy;

import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    public static String gridChallenge(List<String> grid) {
        char[][] buffer = new char[grid.size()][];
        for (int i = 0; i < grid.size(); i++) {
            buffer[i] = grid.get(i).toCharArray();
            Arrays.sort(buffer[i]);
        }

        final int LEN = grid.get(0).length();
        for (int i = 0; i < grid.size() - 1; i++) {
            for (int j = 0; j < LEN; j++) {
                if (buffer[i][j] > buffer[i + 1][j]) {
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
