package com.codingbat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AP1Test {
    @Test
    void wordsWithoutExample1() {
        String[] input = { "a", "b", "c", "a" };
        String target = "a";
        String[] expected = { "b", "c" };
        assertThat(AP1.wordsWithout(input, target)).isEqualTo(expected);
    }

    @Test
    void wordsWithoutClassicExample1() {
        String[] input = { "a", "b", "c", "a" };
        String target = "a";
        String[] expected = { "b", "c" };
        assertThat(AP1.wordsWithoutClassic(input, target)).isEqualTo(expected);
    }

    @Test
    void scoresSpecialExample1() {
        int[] left = { 12, 10, 4 };
        int[] right = { 2, 20, 30 };
        int expected = 40;
        assertThat(AP1.scoresSpecial(left, right)).isEqualTo(expected);
    }

    @Test
    void sumHeightsExample1() {
        int[] input = { 5, 3, 6, 7, 2 };
        int first = 2;
        int last = 4;
        int expected = 6;
        assertThat(AP1.sumHeights(input, first, last)).isEqualTo(expected);
    }

    @Test
    void sumHeights2Example1() {
        int[] input = { 5, 3, 6, 7, 2 };
        int first = 2;
        int last = 4;
        int expected = 7;
        assertThat(AP1.sumHeights2(input, first, last)).isEqualTo(expected);
    }

    @Test
    void bigHeightsExample1() {
        int[] input = { 5, 3, 6, 7, 2 };
        int first = 2;
        int last = 4;
        int expected = 1;
        assertThat(AP1.bigHeights(input, first, last)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({ "bb,1,zz,2,-1", "bb,1,aa,2,1", "bb,1,bb,1,0" })
    void userCompareExamples(String left, int leftId, String right, int rightId, int expected) {
        assertThat(AP1.userCompare(left, leftId, right, rightId)).isEqualTo(expected);
    }

    @Test
    void mergeTwoExample1() {
        String[] left = { "a", "c", "z" };
        String[] right = { "b", "f", "z" };
        int n = 3;
        String[] expected = { "a", "b", "c" };
        assertThat(AP1.mergeTwo(left, right, n)).isEqualTo(expected);
    }

    @Test
    void commonTwoExample4() {
        String[] left = { "a", "a", "b", "b", "c" };
        String[] right = { "a", "b", "b", "b", "c" };
        int expected = 3;
        assertThat(AP1.commonTwo(left, right)).isEqualTo(expected);
    }
}