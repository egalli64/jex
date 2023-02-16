/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track.saddle;

/**
 * Saddle Points: exercism.org/tracks/java/exercises/saddle-points
 * <p>
 * Coordinate for matrix as provided by Exercism
 */
class MatrixCoordinate implements Comparable<MatrixCoordinate> {
    private final int row;
    private final int col;

    MatrixCoordinate(final int row, final int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Row: " + row + ", Column: " + col;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final MatrixCoordinate that = (MatrixCoordinate) o;

        return row == that.row && col == that.col;
    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + col;
        return result;
    }

    @Override
    public int compareTo(MatrixCoordinate o) {
        int rowComparison = Integer.compare(row, o.row);
        return (rowComparison == 0) ? Integer.compare(col, o.col) : rowComparison;
    }
}