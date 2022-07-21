package cb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class String1Test {
    @ParameterizedTest
    @CsvSource({ "Bob,Hello Bob!", "Alice,Hello Alice!", "X,Hello X!" })
    void helloNameExamples(String input, String expected) {
        assertThat(String1.helloName(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "<<>>,Yay,<<Yay>>", "<<>>,WooHoo,<<WooHoo>>", "[[]],word,[[word]]" })
    void makeOutWordExamples(String template, String word, String expected) {
        assertThat(String1.makeOutWord(template, word)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "WooHoo,Woo", "HelloThere,Hello", "abcdef,abc" })
    void firstHalfExamples(String input, String expected) {
        assertThat(String1.firstHalf(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,There,ellohere", "java,code,avaode", "shotl,java,hotlava" })
    void nonStartExamples(String left, String right, String expected) {
        assertThat(String1.nonStart(left, right)).isEqualTo(expected);
    }

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
    @CsvSource({ "Hi,Bye,HiByeByeHi", "Yo,Alice,YoAliceAliceYo", "What,Up,WhatUpUpWhat" })
    void makeAbbaExamples(String a, String b, String expected) {
        assertThat(String1.makeAbba(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "i,Yay,<i>Yay</i>", "i,Hello,<i>Hello</i>", "cite,Yay,<cite>Yay</cite>" })
    void makeTagsExamples(String tag, String content, String expected) {
        assertThat(String1.makeTags(tag, content)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,lololo", "ab,ababab", "Hi,HiHiHi" })
    void extraEndExamples(String input, String expected) {
        assertThat(String1.extraEnd(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,lololo", "ab,ababab", "Hi,HiHiHi" })
    void extraEnd11Examples(String input, String expected) {
        assertThat(String1.extraEnd11(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,He", "abcdefg,ab", "ab,ab" })
    void firstTwoExamples(String input, String expected) {
        assertThat(String1.firstTwo(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,ell", "java,av", "coding,odin" })
    void withoutEndExamples(String input, String expected) {
        assertThat(String1.withoutEnd(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,hi,hiHellohi", "hi,Hello,hiHellohi", "aaa,b,baaab" })
    void comboStringExamples(String a, String b, String expected) {
        assertThat(String1.comboString(a, b)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "Hello,lloHe", "java,vaja", "Hi,Hi" })
    void left2Examples(String input, String expected) {
        assertThat(String1.left2(input)).isEqualTo(expected);
    }
}