package hr.algorithms.greedy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PermutingTwoArraysTest {
    @Test
    void twoArraysSample1() {
        List<Integer> left = Arrays.asList(2, 1, 3);
        List<Integer> right = Arrays.asList(7, 8, 9);
        String actual = PermutingTwoArrays.twoArrays(10, left, right);
        Assertions.assertThat(actual).isEqualTo("YES");
    }

    @Test
    void twoArraysSample2() {
        List<Integer> left = Arrays.asList(1, 2, 2, 1);
        List<Integer> right = Arrays.asList(3, 3, 3, 4);
        String actual = PermutingTwoArrays.twoArrays(5, left, right);
        Assertions.assertThat(actual).isEqualTo("NO");
    }
}