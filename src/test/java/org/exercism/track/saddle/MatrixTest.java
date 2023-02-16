package org.exercism.track.saddle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MatrixTest {
    @Test
    public void getSaddlePointsEmptyZero() {
        var actual = new Matrix(List.of()).getSaddlePoints();
        assertThat(actual).isEmpty();
    }

    @Test
    public void getSaddlePointsPlainZero() {
        Matrix matrix = new Matrix(List.of(List.of(1, 2, 3), List.of(3, 1, 2), List.of(2, 3, 1)));
        var actual = matrix.getSaddlePoints();
        assertThat(actual).isEmpty();
    }

    @Test
    public void getSaddlePointsPlainOne() {
        Matrix matrix = new Matrix(List.of(List.of(9, 8, 7), List.of(5, 3, 2), List.of(6, 6, 7)));
        var actual = matrix.getSaddlePoints();
        var expected = new MatrixCoordinate(2, 1);
        assertThat(actual).containsExactly(expected);
    }

    @Test
    public void getSaddlePointsNonSquare() {
        Matrix matrix = new Matrix(List.of(List.of(3, 1, 3), List.of(3, 2, 4)));
        var actual = matrix.getSaddlePoints();
        var expected = List.of(new MatrixCoordinate(1, 1), new MatrixCoordinate(1, 3));
        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}