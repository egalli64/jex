package cw;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindOddTest {
    @Test
    public void findItGiven1() {
        int actual = FindOdd.findIt(new int[] { 20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5 });
        int expected = 5;

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void findItGiven2() {
        int actual = FindOdd.findIt(new int[] { 1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5 });
        int expected = -1;

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void findItGiven3() {
        int actual = FindOdd.findIt(new int[] { 20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5 });
        int expected = 5;

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void findItGiven4() {
        int actual = FindOdd.findIt(new int[] { 10 });
        int expected = 10;

        Assertions.assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void findItGiven5() {
        int actual = FindOdd.findIt(new int[] { 1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1 });
        int expected = 10;

        Assertions.assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void findItGiven6() {
        int actual = FindOdd.findIt(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10 });
        int expected = 1;

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
