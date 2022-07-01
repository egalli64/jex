package cb;

import org.junit.jupiter.api.Test;

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
}