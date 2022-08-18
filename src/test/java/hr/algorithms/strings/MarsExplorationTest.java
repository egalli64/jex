package hr.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsExplorationTest {
    @Test
    void marsExplorationSample0() {
        String input = "SOSSPSSQSSOR";
        int expected = 3;
        int actual = MarsExploration.marsExploration(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}