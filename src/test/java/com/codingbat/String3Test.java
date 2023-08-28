package com.codingbat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class String3Test {
    @ParameterizedTest
    @CsvSource({ "abXYab,ab", "xx,x", "xxx,x" })
    void sameEndsExamples(String input, String expected) {
        assertThat(String3.sameEnds(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abXYZba,ab", "abca,a", "aba,aba", "123and then 321,123" })
    void mirrorEndsExamples(String s, String expected) {
        assertThat(String3.mirrorEnds(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "hoopla,2", "abbCCCddBBBxx,3", "'',0" })
    void maxBlockExamples(String s, int expected) {
        assertThat(String3.maxBlock(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abc123xyz,123", "aa11b33,44", "7 11,18" })
    void sumNumbersExamples(String s, int expected) {
        assertThat(String3.sumNumbers(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "is test,is not test", "is-is,is not-is not", "This is right,This is not right" })
    void notReplaceExamples(String s, String expected) {
        assertThat(String3.notReplace(s)).isEqualTo(expected);
    }
}