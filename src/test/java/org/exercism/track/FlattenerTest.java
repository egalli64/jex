/*
    Exercism Java track

    Source: https://exercism.org/tracks/java
    My solutions: https://github.com/egalli64/jex
 */
package org.exercism.track;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Flatten Array: https://exercism.org/tracks/java/exercises/flatten-array
 */
class FlattenerTest {
    private final Flattener flattener = new Flattener();

    @Test
    public void flatListIsPreserved() {
        List<Object> input = List.of(0, '1', "two");
        List<Object> expected = List.of(0, '1', "two");
        assertThat(flattener.flatten(input)).isEqualTo(expected);
    }

    @Test
    public void aSingleLevelOfNestingWithNoNulls() {
        List<Object> input = List.of(1, List.of('2', 3, 4, 5, "six", "7"), 8);
        List<Object> expected = List.of(1, '2', 3, 4, 5, "six", "7", 8);
        assertThat(flattener.flatten(input)).isEqualTo(expected);
    }

    @Test
    public void fiveLevelsOfNestingWithNoNulls() {
        List<Object> input = List.of(0, '2',
                List.of(List.of(2, "three"), '8', 100, "four", List.of(List.of(List.of(50)))), "-2");
        List<Object> expected = List.of(0, '2', 2, "three", '8', 100, "four", 50, "-2");
        assertThat(flattener.flatten(input)).isEqualTo(expected);
    }

    @Test
    public void sixLevelsOfNestingWithNoNulls() {
        List<Object> input = List.of("one",
                List.of('2', List.of(List.of(3)), List.of('4', List.of(List.of(5))), "six", 7), "8");
        List<Object> expected = List.of("one", '2', 3, '4', 5, "six", 7, "8");
        assertThat(flattener.flatten(input)).isEqualTo(expected);
    }

    @Test
    public void sixLevelsOfNestingWithNulls() {
        var a23 = List.of("two", '3');
        var a100 = List.of(List.of("one hundred"));
        var aNull = List.of(Collections.singletonList(null));
        var aInner = Arrays.asList(a23, "8", a100, null, aNull, "negative two");

        List<Object> input = Arrays.asList("0", 2, aInner);
        List<Object> expected = List.of("0", 2, "two", '3', "8", "one hundred", "negative two");
        assertThat(flattener.flatten(input)).isEqualTo(expected);
    }

    @Test
    public void nestedListsFullOfNullsOnly() {
        List<Object> input = Arrays.asList(null, List.of(List.of(Collections.singletonList(null))),
                null, null, Arrays.asList(Arrays.asList(null, null), null), null);
        List<Object> expected = List.of();
        assertThat(flattener.flatten(input)).isEqualTo(expected);
    }
}
