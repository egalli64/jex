/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EndXTest {
    @ParameterizedTest
    @CsvSource({ "xxre,rexx", "xxhixx,hixxxx", "xhixhix,hihixxx", "x,x", "'',''" })
    void endXExamples(String input, String expected) {
        assertThat(EndX.endX(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "xxre,rexx", "xxhixx,hixxxx", "xhixhix,hihixxx", "x,x", "'',''" })
    void tailRecExamples(String input, String expected) {
        assertThat(EndX.tailRec(input)).isEqualTo(expected);
    }
}
