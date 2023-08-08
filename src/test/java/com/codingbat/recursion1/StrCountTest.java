/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StrCountTest {
    @ParameterizedTest
    @CsvSource({ "catcowcat,cat,2", "catcowcat,cow,1", "catcowcat,dog,0" })
    void strCountExamples(String s, String sub, int expected) {
        assertThat(StrCount.strCount(s, sub)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "catcowcat,cat,2", "catcowcat,cow,1", "catcowcat,dog,0" })
    void tailRecExamples(String s, String sub, int expected) {
        assertThat(StrCount.tailRec(s, sub)).isEqualTo(expected);
    }
}
