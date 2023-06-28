/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SleepInTest {
    @ParameterizedTest
    @CsvSource({ "false,false,true", "true,false,false", "false,true,true" })
    void plainExamples(boolean weekday, boolean vacation, boolean expected) {
        assertThat(SleepIn.plain(weekday, vacation)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "false,false,true", "true,false,false", "false,true,true" })
    void verboseExamples(boolean weekday, boolean vacation, boolean expected) {
        assertThat(SleepIn.verbose(weekday, vacation)).isEqualTo(expected);
    }
}
