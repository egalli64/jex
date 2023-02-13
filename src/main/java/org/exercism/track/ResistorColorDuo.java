/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

/**
 * Resistor Color Duo: exercism.org/tracks/java/exercises/resistor-color-duo
 * <p>
 * Convert two colors (passed as strings) to integer
 */
class ResistorColorDuo {
    int value(String[] colors) {
        int result = 0;
        for (int i = 0; i < 2; i++) {
            result += switch (colors[i]) {
                case "black" -> 0;
                case "brown" -> 1;
                case "red" -> 2;
                case "orange" -> 3;
                case "yellow" -> 4;
                case "green" -> 5;
                case "blue" -> 6;
                case "violet" -> 7;
                case "grey" -> 8;
                case "white" -> 9;
                default -> throw new IllegalArgumentException("Unknown color");
            } * Math.pow(10, 1 - i);
        }
        return result;
    }
}