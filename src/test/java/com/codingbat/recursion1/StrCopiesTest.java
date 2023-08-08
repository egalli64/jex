/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StrCopiesTest {
    @ParameterizedTest
    @CsvSource({ "catcowcat,cat,2,true", "catcowcat,cow,2,false", "catcowcat,cow,1,true" })
    void strCopiesExamples(String s, String sub, int n, boolean expected) {
        assertThat(StrCopies.strCopies(s, sub, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "catcowcat,cat,2,true", "catcowcat,cow,2,false", "catcowcat,cow,1,true" })
    void tailRecExamples(String s, String sub, int n, boolean expected) {
        assertThat(StrCopies.tailRec(s, sub, n)).isEqualTo(expected);
    }
}
