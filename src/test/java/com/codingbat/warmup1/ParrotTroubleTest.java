/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ParrotTroubleTest {
    @ParameterizedTest
    @CsvSource({ "true, 6, true", "true, 7, false", "false, 6, false" })
    void plainExamples(boolean talk, int hour, boolean expected) {
        assertThat(ParrotTrouble.plain(talk, hour)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "true, 6, true", "true, 7, false", "false, 6, false" })
    void verboseExamples(boolean talk, int hour, boolean expected) {
        assertThat(ParrotTrouble.plain(talk, hour)).isEqualTo(expected);
    }
}
