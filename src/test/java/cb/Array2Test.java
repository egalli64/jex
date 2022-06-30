package cb;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Array2Test {
    @Test
    void countEvensExample1() {
        int[] input = {2, 1, 2, 3, 4};
        int expected = 3;
        assertThat(Array2.countEvens(input)).isEqualTo(expected);
    }

    @Test
    void countEvensExample2() {
        int[] input = {2, 2, 0};
        int expected = 3;
        assertThat(Array2.countEvens(input)).isEqualTo(expected);
    }

    @Test
    void countEvensExample3() {
        int[] input = {1, 3, 5};
        int expected = 0;
        assertThat(Array2.countEvens(input)).isEqualTo(expected);
    }

    @Test
    void sum13Example1() {
        int[] input = {1, 2, 2, 1};
        int expected = 6;
        assertThat(Array2.sum13(input)).isEqualTo(expected);
    }

    @Test
    void sum13Example2() {
        int[] input = {1, 1};
        int expected = 2;
        assertThat(Array2.sum13(input)).isEqualTo(expected);
    }

    @Test
    void sum13Example3() {
        int[] input = {1, 2, 2, 1, 13};
        int expected = 6;
        assertThat(Array2.sum13(input)).isEqualTo(expected);
    }

    @Test
    void sum13Example3a() {
        int[] input = {1, 2, 2, 1, 13, 42};
        int expected = 6;
        assertThat(Array2.sum13(input)).isEqualTo(expected);
    }

    @Test
    void lucky13Example1() {
        int[] input = {0, 2, 4};
        assertThat(Array2.lucky13(input)).isTrue();
    }

    @Test
    void lucky13Example2() {
        int[] input = {1, 2, 3};
        assertThat(Array2.lucky13(input)).isFalse();
    }

    @Test
    void lucky13Example3() {
        int[] input = {1, 2, 4};
        assertThat(Array2.lucky13(input)).isFalse();
    }
}