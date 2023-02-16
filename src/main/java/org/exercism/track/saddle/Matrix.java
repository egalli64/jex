/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.saddle;

import java.util.*;

/**
 * Saddle Points: exercism.org/tracks/java/exercises/saddle-points
 * <p>
 * <ul>A saddle point is
 * <li>greater than or equal to every element in its row
 * <li>less than or equal to every element in its column
 */
class Matrix {
    private final List<List<Integer>> values;

    /**
     * Minimum value for each column - simplify saddle detection
     */
    private final List<Integer> minColumns;

    /**
     * Accept a matrix from the caller, generate min values for each column for efficiency
     *
     * @param values the matrix
     */
    Matrix(List<List<Integer>> values) {
        this.values = values;

        this.minColumns = new ArrayList<>();
        if (!values.isEmpty()) {
            int nCols = values.get(0).size();
            for (int j = 0; j < nCols; j++) {
                Integer minCol = values.get(0).get(j);
                for (int i = 1; i < values.size(); i++) {
                    minCol = Math.min(minCol, values.get(i).get(j));
                }
                minColumns.add(minCol);
            }
        }
    }

    /**
     * Get the saddle points in matrix
     *
     * @return a set of 1-based coordinates
     */
    Set<MatrixCoordinate> getSaddlePoints() {
        Set<MatrixCoordinate> result = new HashSet<>();

        for (int i = 0; i < values.size(); i++) {
            var row = values.get(i);
            Integer maxRow = Collections.max(row);
            for (int j = 0; j < row.size(); j++) {
                Integer cur = row.get(j);
                if (cur.equals(maxRow) && cur.equals(minColumns.get(j))) {
                    result.add(new MatrixCoordinate(i + 1, j + 1));
                }
            }
        }

        return result;
    }
}