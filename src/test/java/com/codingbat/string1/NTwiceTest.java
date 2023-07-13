/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NTwiceTest {
    @ParameterizedTest
    @CsvSource({ "Hello,2,Helo", "Chocolate,3,Choate", "Chocolate,1,Ce" })
    void nTwiceExamples(String s, int n, String expected) {
        assertThat(NTwice.solution(s, n)).isEqualTo(expected);
    }
}
