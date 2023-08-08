/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StrDistTest {
    @ParameterizedTest
    @CsvSource({ "catcowcat,cat,9", "catcowcat,cow,3", "cccatcowcatxx,cat,9", "xyx,z,0", "z,z,1" })
    void strDistExamples(String s, String sub, int expected) {
        assertThat(StrDist.strDist(s, sub)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "catcowcat,cat,9", "catcowcat,cow,3", "cccatcowcatxx,cat,9", "xyx,z,0", "z,z,1" })
    void tailRecExamples(String s, String sub, int expected) {
        assertThat(StrDist.tailRec(s, sub)).isEqualTo(expected);
    }
}
