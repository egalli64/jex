package com.hackerrank.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class WeightedUniformStringsTest {
    @Test
    void weightedUniformStringsExample() {
        String input = "abbcccdddd";
        List<Integer> queries = List.of(1, 7, 5, 4, 15);
        List<String> actual = WeightedUniformStrings.weightedUniformStrings(input, queries);
        List<String> expected = List.of("Yes", "No", "No", "Yes", "No");
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}