/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringCleanTest {
    @ParameterizedTest
    @CsvSource({ "yyzzza,yza", "abbbcdd,abcd", "Hello,Helo" })
    void stringCleanExamples(String input, String expected) {
        assertThat(StringClean.stringClean(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "yyzzza,yza", "abbbcdd,abcd", "Hello,Helo" })
    void tailRecExamples(String input, String expected) {
        assertThat(StringClean.tailRec(input)).isEqualTo(expected);
    }
}
