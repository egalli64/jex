package com.codingbat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class String1Test {
    @ParameterizedTest
    @CsvSource({ "Hello,true,H", "Hello,false,o", "oh,true,o" })
    void theEndExamples(String s, boolean front, String expected) {
        assertThat(String1.theEnd(s, front)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "oddly,true", "y,false", "oddy,false" })
    void endsLyExamples(String s, Boolean expected) {
        assertThat(String1.endsLy(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Candy,and", "and,and", "solving,lvi" })
    void middleThreeExamples(String s, String expected) {
        assertThat(String1.middleThree(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "last,chars,ls", "yo,java,ya", "hi,'',h@" })
    void lastCharsExamples(String left, String right, String expected) {
        assertThat(String1.lastChars(left, right)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "redxx,red", "blueTimes,blue", "xxred,''" })
    void seeColorExamples(String input, String expected) {
        assertThat(String1.seeColor(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,HeHeHe", "ab,ababab", "H,HHH" })
    void extraFrontExamples(String input, String expected) {
        assertThat(String1.extraFront(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,HeHeHe", "ab,ababab", "H,HHH" })
    void extraFront11Examples(String input, String expected) {
        assertThat(String1.extraFront11(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "hippo,hi,hi", "hippo,xip,hip", "hippo,i,h" })
    void startWordExamples(String s, String check, String expected) {
        assertThat(String1.startWord(s, check)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,lololo", "ab,ababab", "Hi,HiHiHi" })
    void extraEnd11Examples(String input, String expected) {
        assertThat(String1.extraEnd11(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,loHel", "java,vaja", "Hi,Hi" })
    void right2Examples(String input, String expected) {
        assertThat(String1.right2(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,ell", "abc,b", "ab,''" })
    void withouEnd2Examples(String input, String expected) {
        assertThat(String1.withouEnd2(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "string,ri", "code,od", "Practice,ct" })
    void middleTwoExamples(String input, String expected) {
        assertThat(String1.middleTwo(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,2,Helo", "Chocolate,3,Choate", "Chocolate,1,Ce" })
    void nTwiceExamples(String s, int n, String expected) {
        assertThat(String1.nTwice(s, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "java,0,ja", "java,2,va", "java,3,ja" })
    void twoCharExamples(String s, int n, String expected) {
        assertThat(String1.twoChar(s, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "badxx,true", "xbadxx,true", "xxbadxx,false" })
    void hasBadExamples(String s, boolean expected) {
        assertThat(String1.hasBad(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "hello,he", "hi,hi", "h,h@" })
    void atFirstExamples(String s, String expected) {
        assertThat(String1.atFirst(s)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "abc,cat,abcat", "dog,cat,dogcat", "abc,'',abc" })
    void conCatExamples(String s, String t, String expected) {
        assertThat(String1.conCat(s, t)).isEqualTo(expected);
    }

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