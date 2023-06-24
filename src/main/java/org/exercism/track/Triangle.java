/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import java.util.Arrays;

/**
 * Triangle: exercism.org/tracks/java/exercises/triangle
 */
class Triangle {

    /**
     * the triangle sides, sorted
     */
    private final double[] sides;

    /**
     * Constructor
     *
     * @param side1 first side
     * @param side2 second side
     * @param side3 third side
     * @throws TriangleException in case of single-dot or inequality violation
     */
    Triangle(double side1, double side2, double side3) throws TriangleException {
        sides = new double[]{side1, side2, side3};
        Arrays.sort(sides);

        if (sides[0] + sides[1] < sides[2] || side1 == 0 && side2 == 0 && side3 == 0) {
            throw new TriangleException();
        }
    }

    /**
     * Has the triangle all equal sides?
     *
     * @return true if equilateral
     */
    boolean isEquilateral() {
        return sides[0] == sides[1] && sides[0] == sides[2];
    }

    /**
     * Has the triangle at least two equal sides?
     *
     * @return true if isosceles (or equilateral)
     */
    boolean isIsosceles() {
        return sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2];
    }

    /**
     * Has the triangle all different sides?
     *
     * @return true if scalene
     */
    boolean isScalene() {
        return sides[0] != sides[1] && sides[1] != sides[2] && sides[0] != sides[2];
    }
}

/**
 * Specific exception for this class only
 */
@SuppressWarnings("serial")
class TriangleException extends Exception {
}
