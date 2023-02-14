/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

/**
 * Triangle: exercism.org/tracks/java/exercises/triangle
 */
class TriangleTest {
    @Test
    void triangleInequalityViolation() {
        assertThatExceptionOfType(TriangleException.class).isThrownBy(() -> new Triangle(7, 3, 2));
    }

    @Test
    void triangleSingleDotViolation() {
        assertThatExceptionOfType(TriangleException.class).isThrownBy(() -> new Triangle(0, 0, 0));
    }

    @ParameterizedTest
    @CsvSource({".5", "42.18"})
    void isEquilateral(double side) throws TriangleException {
        Triangle t = new Triangle(side, side, side);
        assertThat(t.isEquilateral()).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"3.0, 4.0", "4.0, 3.0"})
    void isIsosceles(double couple, double single) throws TriangleException {
        Triangle t = new Triangle(couple, couple, single);
        assertThat(t.isIsosceles()).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"5.0, 4.0, 6.0", "0.5, 0.4, 0.6"})
    void isScalenePositive(double first, double second, double third) throws TriangleException {
        Triangle t = new Triangle(first, second, third);
        assertThat(t.isScalene()).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"3.0, 4.0", "4.0, 3.0", ".5, .5", "42.18, 42.18"})
    void isScaleneNegative(double couple, double single) throws TriangleException {
        Triangle t = new Triangle(couple, couple, single);
        assertThat(t.isScalene()).isFalse();
    }
}