package com.codingbat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class String1Test {
    @ParameterizedTest
    @CsvSource({ "coding,codign", "cat,cta", "ab,ba" })
    void lastTwoExamples(String s, String expected) {
        assertThat(String1.lastTwo(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "edited,true", "edit,false", "ed,true" })
    void frontAgainExamples(String s, boolean expected) {
        assertThat(String1.frontAgain(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,Hi,loHi", "Hello,java,ellojava", "java,Hello,javaello" })
    void minCatExamples(String s, String t, String expected) {
        assertThat(String1.minCat(s, t)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "HelloHe,lloHe", "HelloHi,HelloHi", "Hi,''" })
    void without2Examples(String s, String expected) {
        assertThat(String1.without2(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,llo", "java,va", "away,aay" })
    void deFrontExamples(String s, String expected) {
        assertThat(String1.deFront(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "xHix,Hi", "xHi,Hi", "Hxix,Hxi" })
    void withoutXExamples(String s, String expected) {
        assertThat(String1.withoutX(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "xHi,Hi", "Hxi,Hi", "Hi,Hi" })
    void withoutX2Examples(String s, String expected) {
        assertThat(String1.withoutX2(s)).isEqualTo(expected);
    }
}