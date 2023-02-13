/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Resistor Color Duo: exercism.org/tracks/java/exercises/resistor-color-duo
 * <p>
 * Convert two colors (passed as strings) to integer
 */
class ResistorColorDuoTest {
    private final ResistorColorDuo duo = new ResistorColorDuo();

    @ParameterizedTest
    @CsvSource(textBlock = """
            brown, black, 10
            blue, grey, 68
            yellow, violet, 47
            orange, orange, 33
            """)
    void valueCouple(String first, String second, int expected) {
        assertThat(duo.value(new String[]{first, second})).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            brown, black, yellow, 10
            green, brown, orange, 51
            """)
    void valueTriplet(String first, String second, String third, int expected) {
        assertThat(duo.value(new String[]{first, second, third})).isEqualTo(expected);
    }
}