package com.hackerrank.algorithms.greedy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MaximumPerimeterTriangleTest {
    @Test
    void maximumPerimeterTriangleExample() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 10);
        List<Integer> expected = List.of(3, 4, 5);
        List<Integer> actual = MaximumPerimeterTriangle.maximumPerimeterTriangle(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void maximumPerimeterTriangleSample1() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expected = List.of(-1);
        List<Integer> actual = MaximumPerimeterTriangle.maximumPerimeterTriangle(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}