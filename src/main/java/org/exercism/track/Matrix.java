/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Matrix: exercism.org/tracks/java/exercises/matrix
 * <p>
 * Given a string representing a matrix of int, return the rows and columns of that matrix.
 */
class Matrix {
    private final List<int[]> rows;

    /**
     * Extract the matrix from a string. The element separator is a blank, the row separator is a newline.
     * <p>
     * Regular, non-empty int matrix only. Expect a lot of exceptions for "strange" input.
     *
     * @param matrixAsString the matrix as a string
     */
    Matrix(String matrixAsString) {
        rows = new ArrayList<>();

        for (String line : matrixAsString.split("\n")) {
            rows.add(Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray());
        }
    }

    /**
     * Getter for a row
     *
     * @param rowNumber the 1-based index
     * @return the requested row (or exception)
     */
    int[] getRow(int rowNumber) {
        return rows.get(rowNumber - 1);
    }

    /**
     * Getter for column
     *
     * @param columnNumber the 1-based index
     * @return the requested column (or exception)
     */
    int[] getColumn(int columnNumber) {
        return rows.stream().mapToInt(row -> row[columnNumber - 1]).toArray();
    }
}