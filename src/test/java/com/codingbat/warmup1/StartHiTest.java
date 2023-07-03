/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StartHiTest {
    @ParameterizedTest
    @CsvSource({ "hi there,true", "hi,true", "hello hi,false" })
    void checkCharsExamples(String input, boolean expected) {
        assertThat(StartHi.checkChars(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "hi there,true", "hi,true", "hello hi,false" })
    void startsWithExamples(String input, boolean expected) {
        assertThat(StartHi.startsWith(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "hi there,true", "hi,true", "hello hi,false" })
    void subExamples(String input, boolean expected) {
        assertThat(StartHi.sub(input)).isEqualTo(expected);
    }
}
