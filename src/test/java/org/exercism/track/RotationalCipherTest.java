/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Rotational Cipher: exercism.org/tracks/java/exercises/rotational-cipher
 */
class RotationalCipherTest {
    @ParameterizedTest
    @CsvSource(textBlock = """
            0, a, a
            1, a, b
            26, a, a
            13, n, a
            5, OMG, TRL
            5, O M G, T R L
            4, Testing 1 2 3 testing, Xiwxmrk 1 2 3 xiwxmrk
            13, Gur dhvpx oebja sbk whzcf bire gur ynml qbt., The quick brown fox jumps over the lazy dog.
            """)
    void rotate(int shift, String input, String expected) {
        String actual = new RotationalCipher(shift).rotate(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}