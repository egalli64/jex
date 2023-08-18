/*
  CodingBat Java String 2 - https://codingbat.com/java/String-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.string2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MixStringTest {
    @ParameterizedTest
    @CsvSource({ "abc,xyz,axbycz", "Hi,There,HTihere", "xxxx,There,xTxhxexre" })
    void mixStringExamples(String a, String b, String expected) {
        assertThat(MixString.solution(a, b)).isEqualTo(expected);
    }
}
