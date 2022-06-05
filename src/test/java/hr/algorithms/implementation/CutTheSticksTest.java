package hr.algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CutTheSticksTest {
    @Test
    void cutTheSticksZero() {
        List<Integer> input = Arrays.asList(5, 4, 4, 2, 2, 8);
        List<Integer> expected = List.of(6, 4, 2, 1);

        List<Integer> actual = CutTheSticks.cutTheSticks(input);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void cutTheSticksOne() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 3, 3, 2, 1);
        List<Integer> expected = List.of(8, 6, 4, 1);

        List<Integer> actual = CutTheSticks.cutTheSticks(input);
        assertThat(actual).isEqualTo(expected);
    }
}