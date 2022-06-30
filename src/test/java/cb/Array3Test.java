package cb;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Array3Test {
    @Test
    void maxSpanExample1() {
        int[] input = {1, 2, 1, 1, 3};
        int expected = 4;

        assertThat(Array3.maxSpan(input)).isEqualTo(expected);
    }

    @Test
    void maxSpanExample2() {
        int[] input = {1, 4, 2, 1, 4, 1, 4};
        int expected = 6;

        assertThat(Array3.maxSpan(input)).isEqualTo(expected);
    }

    @Test
    void maxSpanExample3() {
        int[] input = {1, 4, 2, 1, 4, 4, 4};
        int expected = 6;

        assertThat(Array3.maxSpan(input)).isEqualTo(expected);
    }

    @Test
    void maxSpanSingle() {
        int[] input = {42};
        int expected = 1;

        assertThat(Array3.maxSpan(input)).isEqualTo(expected);
    }

    @Test
    void canBalanceExample1() {
        int[] input = {1, 1, 1, 2, 1};
        assertThat(Array3.canBalance(input)).isTrue();
    }

    @Test
    void canBalanceExample2() {
        int[] input = {2, 1, 1, 2, 1};
        assertThat(Array3.canBalance(input)).isFalse();
    }

    @Test
    void canBalanceExample3() {
        int[] input = {10, 10};
        assertThat(Array3.canBalance(input)).isTrue();
    }

    @Test
    void seriesUpExample1() {
        int input = 3;
        int[] expected = {1, 1, 2, 1, 2, 3};
        assertThat(Array3.seriesUp(input)).containsExactly(expected);
    }

    @Test
    void seriesUpExample2() {
        int input = 4;
        int[] expected = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
        assertThat(Array3.seriesUp(input)).containsExactly(expected);
    }

    @Test
    void seriesUpExample3() {
        int input = 2;
        int[] expected = {1, 1, 2};
        assertThat(Array3.seriesUp(input)).containsExactly(expected);
    }
}