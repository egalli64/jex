/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MixStartTest {
    @ParameterizedTest
    @CsvSource({ "mix snacks,true", "pix snacks,true", "piz snacks,false" })
    void byCharExamples(String input, boolean expected) {
        assertThat(MixStart.byChar(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "mix snacks,true", "pix snacks,true", "piz snacks,false" })
    void subExamples(String input, boolean expected) {
        assertThat(MixStart.sub(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "mix snacks,true", "pix snacks,true", "piz snacks,false" })
    void indexExamples(String input, boolean expected) {
        assertThat(MixStart.index(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "mix snacks,true", "pix snacks,true", "piz snacks,false" })
    void lastIndexExamples(String input, boolean expected) {
        assertThat(MixStart.lastIndex(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "mix snacks,true", "pix snacks,true", "piz snacks,false" })
    void simpleMatchExamples(String input, boolean expected) {
        assertThat(MixStart.simpleMatch(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "mix snacks,true", "pix snacks,true", "piz snacks,false" })
    void matchExamples(String input, boolean expected) {
        assertThat(MixStart.match(input)).isEqualTo(expected);
    }
}
