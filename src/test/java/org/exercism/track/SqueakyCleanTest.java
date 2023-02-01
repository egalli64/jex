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

/**
 * Squeaky Clean: exercism.org/tracks/java/exercises/squeaky-clean
 */
class SqueakyCleanTest {
    @Test
    void cleanWhitespace() {
        String input = "my   Id";
        String expected = "my___Id";
        String actual = SqueakyClean.clean(input);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            my\0Id, myCTRLId
            my\0\r\u007FId, myCTRLCTRLCTRLId
            """)
    void cleanCtrl(String input, String expected) {
        String actual = SqueakyClean.clean(input);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void cleanKebab() {
        String input = "à-ḃç";
        String expected = "àḂç";
        String actual = SqueakyClean.clean(input);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void cleanNonLetter() {
        String input = "a1\uD83D\uDE002\uD83D\uDE003\uD83D\uDE00b";
        String expected = "ab";
        String actual = SqueakyClean.clean(input);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void cleanGreek() {
        String input = "MyΟβιεγτFinder";
        String expected = "MyΟFinder";
        String actual = SqueakyClean.clean(input);
        assertThat(actual).isEqualTo(expected);
    }
}