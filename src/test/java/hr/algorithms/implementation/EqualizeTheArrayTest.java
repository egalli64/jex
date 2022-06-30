package hr.algorithms.implementation;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class EqualizeTheArrayTest {

    @Test
    void equalizeArray() {
        List<Integer> input = Arrays.asList(3, 3, 2, 1, 3);
        int expected = 2;

        int actual = EqualizeTheArray.equalizeArray(input);
        assertThat(actual).isEqualTo(expected);
    }
}
