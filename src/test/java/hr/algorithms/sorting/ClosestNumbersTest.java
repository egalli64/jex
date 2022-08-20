package hr.algorithms.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ClosestNumbersTest {
    @Test
    void closestNumbersSample2() {
        List<Integer> input = Arrays.asList(5, 4, 3, 2);
        List<Integer> expected = List.of(2, 3, 3, 4, 4, 5);
        List<Integer> actual = ClosestNumbers.closestNumbers(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}