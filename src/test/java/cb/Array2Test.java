package cb;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Array2Test {
    @Test
    void countEvensExample1() {
        int[] input = { 2, 1, 2, 3, 4 };
        int expected = 3;
        assertThat(Array2.countEvens(input)).isEqualTo(expected);
    }

    @Test
    void countEvensExample2() {
        int[] input = { 2, 2, 0 };
        int expected = 3;
        assertThat(Array2.countEvens(input)).isEqualTo(expected);
    }

    @Test
    void countEvensExample3() {
        int[] input = { 1, 3, 5 };
        int expected = 0;
        assertThat(Array2.countEvens(input)).isEqualTo(expected);
    }

    @Test
    void sum13Example1() {
        int[] input = { 1, 2, 2, 1 };
        int expected = 6;
        assertThat(Array2.sum13(input)).isEqualTo(expected);
    }

    @Test
    void sum13Example2() {
        int[] input = { 1, 1 };
        int expected = 2;
        assertThat(Array2.sum13(input)).isEqualTo(expected);
    }

    @Test
    void sum13Example3() {
        int[] input = { 1, 2, 2, 1, 13 };
        int expected = 6;
        assertThat(Array2.sum13(input)).isEqualTo(expected);
    }

    @Test
    void sum13Example3a() {
        int[] input = { 1, 2, 2, 1, 13, 42 };
        int expected = 6;
        assertThat(Array2.sum13(input)).isEqualTo(expected);
    }

    @Test
    void lucky13Example1() {
        int[] input = { 0, 2, 4 };
        assertThat(Array2.lucky13(input)).isTrue();
    }

    @Test
    void lucky13Example2() {
        int[] input = { 1, 2, 3 };
        assertThat(Array2.lucky13(input)).isFalse();
    }

    @Test
    void lucky13Example3() {
        int[] input = { 1, 2, 4 };
        assertThat(Array2.lucky13(input)).isFalse();
    }

    @Test
    void fizzArrayExample1() {
        int input = 4;
        int[] expected = { 0, 1, 2, 3 };
        assertThat(Array2.fizzArray(input)).containsExactly(expected);
    }

    @Test
    void no14Example1() {
        int[] input = { 1, 2, 3 };
        assertThat(Array2.no14(input)).isTrue();
    }

    @Test
    void matchUpExample1() {
        int[] left = { 1, 2, 3 };
        int[] right = { 2, 3, 10 };
        int expected = 2;
        assertThat(Array2.matchUp(left, right)).isEqualTo(expected);
    }

    @Test
    void bigDiffExample1() {
        int[] values = { 10, 3, 5, 6 };
        int expected = 7;
        assertThat(Array2.bigDiff(values)).isEqualTo(expected);
    }

    @Test
    void centeredAverageExample1() {
        int[] values = { 1, 2, 3, 4, 100 };
        int expected = 3;
        assertThat(Array2.centeredAverage(values)).isEqualTo(expected);
    }

    @Test
    void sum67Example1() {
        int[] values = { 1, 2, 2 };
        int expected = 5;
        assertThat(Array2.sum67(values)).isEqualTo(expected);
    }
}