package com.codingbat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Recursion1Test {
    @ParameterizedTest
    @CsvSource({"11abc11,2", "abc11x11x11,3", "111,1"})
    void count11Examples(String input, int expected) {
        assertThat(Recursion1.count11(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"yyzzza,yza", "abbbcdd,abcd", "Hello,Helo"})
    void stringCleanExamples(String input, String expected) {
        assertThat(Recursion1.stringClean(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"ahixhi,1", "ahibhi,2", "xhixhi,0"})
    void countHi2Examples(String input, int expected) {
        assertThat(Recursion1.countHi2(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"xyz(abc)123,(abc)", "x(hello),(hello)", "(xy)1,(xy)"})
    void parenBitExamples(String input, String expected) {
        assertThat(Recursion1.parenBit(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"(()),true", "((())),true", "(((x)),false"})
    void nestParenExamples(String input, boolean expected) {
        assertThat(Recursion1.nestParen(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"catcowcat,cat,2", "catcowcat,cow,1", "catcowcat,dog,0"})
    void strCountExamples(String s, String sub, int expected) {
        assertThat(Recursion1.strCount(s, sub)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"catcowcat,cat,2,true", "catcowcat,cow,2,false", "catcowcat,cow,1,true"})
    void strCopiesExamples(String s, String sub, int n, boolean expected) {
        assertThat(Recursion1.strCopies(s, sub, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"catcowcat,cat,9", "catcowcat,cow,3", "cccatcowcatxx,cat,9", "xyx,z,0", "z,z,1"})
    void strDistExamples(String s, String sub, int expected) {
        assertThat(Recursion1.strDist(s, sub)).isEqualTo(expected);
    }
}