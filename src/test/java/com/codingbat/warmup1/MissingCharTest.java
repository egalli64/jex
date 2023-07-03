/*
  CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MissingCharTest {
    @ParameterizedTest
    @CsvSource({ "1,ktten", "0,itten", "4,kittn" })
    void plainExamples(int input, String expected) {
        assertThat(MissingChar.plain("kitten", input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1,ktten", "0,itten", "4,kittn" })
    void deleteCharAtExamples(int input, String expected) {
        assertThat(MissingChar.deleteCharAt("kitten", input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "1,ktten", "0,itten", "4,kittn" })
    void oneLinerExamples(int input, String expected) {
        assertThat(MissingChar.oneLiner("kitten", input)).isEqualTo(expected);
    }
}
