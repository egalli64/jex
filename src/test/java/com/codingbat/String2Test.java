package com.codingbat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class String2Test {
    @ParameterizedTest
    @CsvSource({ "abcbob,true", "b9b,true", "bac,false" })
    void bobThereExamples(String input, boolean expected) {
        assertThat(String2.bobThere(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,3,llollollo", "Hello,2,lolo", "Hello,1,o" })
    void repeatEnd11Examples(String s, int n, String expected) {
        assertThat(String2.repeatEnd11(s, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,3,llollollo", "Hello,2,lolo", "Hello,1,o" })
    void repeatEndExamples(String s, int n, String expected) {
        assertThat(String2.repeatEnd(s, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abXYabc,1,true", "abXYabc,2,true", "abXYabc,3,false" })
    void prefixAgainExamples(String s, int n, boolean expected) {
        assertThat(String2.prefixAgain(s, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "xy*yzz,true", "xy*zzz,false", "*xa*az,true" })
    void sameStarCharExamples(String input, boolean expected) {
        assertThat(String2.sameStarChar(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hiabc,abc,true", "AbC,HiaBc,true", "abc,abXabc,true" })
    void endOtherExamples(String a, String b, boolean expected) {
        assertThat(String2.endOther(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abcxyz,true", "abc.xyz,false", "xyz.abc,true" })
    void xyzThereExamples(String input, boolean expected) {
        assertThat(String2.xyzThere(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "aaxbby,true", "aaxbb,false", "yaaxbb,false" })
    void xyBalanceExamples(String input, boolean expected) {
        assertThat(String2.xyBalance(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abc,xyz,axbycz", "Hi,There,HTihere", "xxxx,There,xTxhxexre" })
    void mixStringExamples(String a, String b, String expected) {
        assertThat(String2.mixString(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Chocolate,4,ChocChoChC", "Chocolate,3,ChoChC", "Ice Cream,2,IcI" })
    void repeatFrontExamples(String s, int n, String expected) {
        assertThat(String2.repeatFront(s, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Word,X,3,WordXWordXWord", "This,And,2,ThisAndThis", "This,And,1,This" })
    void repeatSeparatorExamples(String word, String separator, int n, String expected) {
        assertThat(String2.repeatSeparator(word, separator, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "AAxyzBB,true", "AxyzBB,true", "AxyzBBB,false" })
    void xyzMiddleExamples(String input, boolean expected) {
        assertThat(String2.xyzMiddle(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "breadjambread,jam", "xxbreadjambreadyy,jam", "xxbreadyy,''" })
    void getSandwichExamples(String s, String expected) {
        assertThat(String2.getSandwich(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abc,bca", "tca,cat", "tcagdo,catdog" })
    void oneTwoExamples(String s, String expected) {
        assertThat(String2.oneTwo(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "zipXzap,zpXzp", "zopzop,zpzp", "zzzopzop,zzzpzp" })
    void zipZapExamples(String s, String expected) {
        assertThat(String2.zipZap(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "ab*cd,ad", "ab**cd,ad", "sm*eilly,silly" })
    void starOutExamples(String s, String expected) {
        assertThat(String2.starOut(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "12xy34,xy,++xy++", "12xy34,1,1+++++", "12xy34xyabcxy,xy,++xy++xy+++xy" })
    void plusOutExamples(String s, String w, String expected) {
        assertThat(String2.plusOut(s, w)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abcXY123XYijk,XY,c13i", "XY123XY,XY,13", "XY1XY,XY,11" })
    void wordEndsExamples(String s, String w, String expected) {
        assertThat(String2.wordEnds(s, w)).isEqualTo(expected);
    }
}