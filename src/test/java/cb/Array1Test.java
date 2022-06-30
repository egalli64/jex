package cb;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Array1Test {
    @Test
    void firstLast6Example1() {
        int[] input = {1, 2, 6};
        assertThat(Array1.firstLast6(input)).isTrue();
    }

    @Test
    void firstLast6Example2() {
        int[] input = {6, 1, 2, 3};
        assertThat(Array1.firstLast6(input)).isTrue();
    }

    @Test
    void firstLast6Example3() {
        int[] input = {13, 6, 1, 2, 3};
        assertThat(Array1.firstLast6(input)).isFalse();
    }

    @Test
    void commonEndExample1() {
        int[] first = {1, 2, 3};
        int[] second = {7, 3};
        assertThat(Array1.commonEnd(first, second)).isTrue();
    }

    @Test
    void commonEndExample2() {
        int[] first = {1, 2, 3};
        int[] second = {7, 3, 2};
        assertThat(Array1.commonEnd(first, second)).isFalse();
    }

    @Test
    void commonEndExample3() {
        int[] first = {1, 2, 3};
        int[] second = {1, 3};
        assertThat(Array1.commonEnd(first, second)).isTrue();
    }

    @Test
    void reverse3Example1() {
        int[] input = {1, 2, 3};
        int[] expected = {3, 2, 1};
        assertThat(Array1.reverse3(input)).containsExactly(expected);
    }

    @Test
    void reverse3Example2() {
        int[] input = {5, 11, 9};
        int[] expected = {9, 11, 5};
        assertThat(Array1.reverse3(input)).containsExactly(expected);
    }

    @Test
    void reverse3Example3() {
        int[] input = {7, 0, 0};
        int[] expected = {0, 0, 7};
        assertThat(Array1.reverse3(input)).containsExactly(expected);
    }

}