/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatException;

/**
 * Matrix: exercism.org/tracks/java/exercises/matrix
 * <p>
 * Given a string representing a matrix of int, return the rows and columns of that matrix.
 */
class MatrixTest {
    @Test
    void getRowEmpty() {
        assertThatException().isThrownBy(() -> new Matrix(""));
    }

    @Test
    void getRowSingle() {
        String input = "1";
        Matrix matrix = new Matrix(input);

        int[] actual = matrix.getRow(1);
        int[] expected = {1};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getRowSquaredTwo() {
        String input = "1 2\n3 4";
        Matrix matrix = new Matrix(input);

        int[] actual = matrix.getRow(2);
        int[] expected = {3, 4};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getRowFourByThree() {
        String input = "1 2 3\n4 5 6\n7 8 9\n8 7 6";
        Matrix matrix = new Matrix(input);

        int[] actual = matrix.getRow(4);
        int[] expected = {8, 7, 6};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void getColumnSingle() {
        String input = "1";
        Matrix matrix = new Matrix(input);

        int[] actual = matrix.getColumn(1);
        int[] expected = {1};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void getColumnSquared3() {
        String input = "1 2 3\n4 5 6\n7 8 9";
        Matrix matrix = new Matrix(input);

        int[] actual = matrix.getColumn(3);
        int[] expected = {3, 6, 9};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void getColumnThreeByFour() {
        String input = "1 2 3 4\n5 6 7 8\n9 8 7 6";
        Matrix matrix = new Matrix(input);

        int[] actual = matrix.getColumn(4);
        int[] expected = {4, 8, 6};

        assertThat(actual).isEqualTo(expected);
    }
}