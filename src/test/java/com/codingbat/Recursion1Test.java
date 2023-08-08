package com.codingbat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Recursion1Test {
    @ParameterizedTest
    @CsvSource({"catcowcat,cat,9", "catcowcat,cow,3", "cccatcowcatxx,cat,9", "xyx,z,0", "z,z,1"})
    void strDistExamples(String s, String sub, int expected) {
        assertThat(Recursion1.strDist(s, sub)).isEqualTo(expected);
    }
}