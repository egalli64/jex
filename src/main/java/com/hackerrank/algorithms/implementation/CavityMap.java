/*
    Prepare > Algorithms > Implementation > Cavity Map
    https://www.hackerrank.com/challenges/cavity-map

    The input list represents a _squared_ map
    Each char is an integer representing the height of that place
    A cavity is a cell, not on the border, higher of the adjacent ones
    Replace each cavity with a 'X'
 */
package com.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;

public class CavityMap {
    public static List<String> cavityMap(List<String> grid) {
        if(grid.size() < 3) {
            return grid;
        }
        List<String> result = new ArrayList<>(grid.size());

        result.add(grid.get(0));
        for (int i = 1; i < grid.size() - 1; i++) {
            String upperRow = grid.get(i - 1);
            String row = grid.get(i);
            StringBuilder generated = new StringBuilder();
            String lowerRow = grid.get(i + 1);

            generated.append(row.charAt(0));
            for (int j = 1; j < row.length() - 1; j++) {
                char current = row.charAt(j);

                char left = row.charAt(j - 1);
                char right = row.charAt(j + 1);

                char up = upperRow.charAt(j);
                char down = lowerRow.charAt(j);

                if (current > left && current > right && current > up && current > down) {
                    generated.append('X');
                } else {
                    generated.append(current);
                }
            }
            generated.append(row.charAt(row.length() - 1));
            result.add(generated.toString());
        }
        result.add(grid.get(grid.size() - 1));
        return result;
    }
}
