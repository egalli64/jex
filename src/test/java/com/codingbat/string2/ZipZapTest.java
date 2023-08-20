/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ZipZapTest {
    @ParameterizedTest
    @CsvSource({ "zipXzap,zpXzp", "zopzop,zpzp", "zzzopzop,zzzpzp" })
    void zipZapExamples(String s, String expected) {
        assertThat(ZipZap.solution(s)).isEqualTo(expected);
    }
}
