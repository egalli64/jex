/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConCatTest {
    @ParameterizedTest
    @CsvSource({ "abc,cat,abcat", "dog,cat,dogcat", "abc,'',abc" })
    void conCatExamples(String s, String t, String expected) {
        assertThat(ConCat.solution(s, t)).isEqualTo(expected);
    }
}
