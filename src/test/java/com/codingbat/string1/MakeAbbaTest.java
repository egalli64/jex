/*
  CodingBat Java String 1 - https://codingbat.com/java/String-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MakeAbbaTest {
    @ParameterizedTest
    @CsvSource({ "Hi,Bye,HiByeByeHi", "Yo,Alice,YoAliceAliceYo", "What,Up,WhatUpUpWhat" })
    void solutionExamples(String a, String b, String expected) {
        assertThat(MakeAbba.solution(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hi,Bye,HiByeByeHi", "Yo,Alice,YoAliceAliceYo", "What,Up,WhatUpUpWhat" })
    void builderExamples(String a, String b, String expected) {
        assertThat(MakeAbba.builder(a, b)).isEqualTo(expected);
    }
}
