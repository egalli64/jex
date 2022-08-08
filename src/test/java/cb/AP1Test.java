package cb;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AP1Test {
    @Test
    void scoresIncreasingExample1() {
        int[] input = {1, 3, 4};
        assertThat(AP1.scoresIncreasing(input)).isTrue();
    }

    @Test
    void scoresIncreasingExample2() {
        int[] input = {1, 3, 2};
        assertThat(AP1.scoresIncreasing(input)).isFalse();
    }

    @Test
    void scoresIncreasingExample3() {
        int[] input = {1, 1, 4};
        assertThat(AP1.scoresIncreasing(input)).isTrue();
    }

    @Test
    void scoresAverageExample1() {
        int[] input = {2, 2, 4, 4};
        int expected = 4;
        assertThat(AP1.scoresAverage(input)).isEqualTo(expected);
    }

    @Test
    void scoresAverageExample2() {
        int[] input = {4, 4, 4, 2, 2, 2};
        int expected = 4;
        assertThat(AP1.scoresAverage(input)).isEqualTo(expected);
    }

    @Test
    void scoresAverageExample3() {
        int[] input = {3, 4, 5, 1, 2, 3};
        int expected = 4;
        assertThat(AP1.scoresAverage(input)).isEqualTo(expected);
    }

    @Test
    void wordsWithoutListExample1() {
        String[] input = {"a", "bb", "b", "ccc"};
        int forbiddenLen = 1;
        List<String> expected = List.of("bb", "ccc");
        assertThat(AP1.wordsWithoutList(input, forbiddenLen)).containsExactlyElementsOf(expected);
    }

    @Test
    void wordsWithoutListExample2() {
        String[] input = {"a", "bb", "b", "ccc"};
        int forbiddenLen = 3;
        List<String> expected = List.of("a", "bb", "b");
        assertThat(AP1.wordsWithoutList(input, forbiddenLen)).containsExactlyElementsOf(expected);
    }

    @Test
    void wordsWithoutListExample3() {
        String[] input = {"a", "bb", "b", "ccc"};
        int forbiddenLen = 4;
        List<String> expected = List.of("a", "bb", "b", "ccc");
        assertThat(AP1.wordsWithoutList(input, forbiddenLen)).containsExactlyElementsOf(expected);
    }

    @Test
    void scores100Example1() {
        int[] input = {1, 100, 100};
        assertThat(AP1.scores100(input)).isTrue();
    }

    @Test
    void wordsCountExample1() {
        String[] input = {"a", "bb", "b", "ccc"};
        int len = 1;
        int expected = 2;
        assertThat(AP1.wordsCount(input, len)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"10,true", "22,false", "220,false"})
    void hasOneExamples(int number, boolean expected) {
        assertThat(AP1.hasOne(number)).isEqualTo(expected);
    }

    @Test
    void scoresClumpExample2() {
        int[] input = {3, 4, 6};
        assertThat(AP1.scoresClump(input)).isFalse();
    }

    @Test
    void scoresClumpExample3() {
        int[] input = {1, 3, 5, 5};
        assertThat(AP1.scoresClump(input)).isTrue();
    }

    @Test
    void wordsFrontExample1() {
        String[] input = {"a", "b", "c", "d"};
        int n = 1;
        String[] expected = {"a"};
        assertThat(AP1.wordsFront(input, n)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"128,true", "12,true", "120,false"})
    void dividesSelfExamples(int number, boolean expected) {
        assertThat(AP1.dividesSelf(number)).isEqualTo(expected);
    }

    @Test
    void copyEvensExample2() {
        int[] input = {3, 2, 4, 5, 8};
        int n = 3;
        int[] expected = {2, 4, 8};
        assertThat(AP1.copyEvens(input, n)).isEqualTo(expected);
    }

    @Test
    void copyEndyExample1() {
        int[] input = {9, 11, 90, 22, 6};
        int n = 2;
        int[] expected = {9, 90};
        assertThat(AP1.copyEndy(input, n)).isEqualTo(expected);
    }

    @Test
    void matchUpExample1() {
        String[] left = {"aa", "bb", "cc"};
        String[] right = {"aaa", "xx", "bb"};
        int expected = 1;
        assertThat(AP1.matchUp(left, right)).isEqualTo(expected);
    }

}