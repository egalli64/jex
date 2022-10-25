package hr.algorithms.greedy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class LargestPermutationTest {
    @Test
    void largestPermutationExample1() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        int k = 1;
        List<Integer> expected = Arrays.asList(4, 2, 3, 1);
        List<Integer> actual = LargestPermutation.largestPermutation(k, input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void largestPermutationExample2() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        int k = 2;
        List<Integer> expected = Arrays.asList(4, 3, 2, 1);
        List<Integer> actual = LargestPermutation.largestPermutation(k, input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}