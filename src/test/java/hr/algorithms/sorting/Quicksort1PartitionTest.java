package hr.algorithms.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Quicksort1PartitionTest {
    @Test
    void quickSortSample() {
        List<Integer> input = Arrays.asList(4, 5, 3, 7, 2);
        Integer pivot = input.get(0);
        List<Integer> actual = Quicksort1Partition.quickSort(input);
        Iterator<Integer> it = actual.iterator();
        while (it.hasNext()) {
            Integer cur = it.next();
            Assertions.assertThat(cur).isLessThanOrEqualTo(pivot);
            if (cur.equals(pivot)) {
                break;
            }
        }
        while (it.hasNext()) {
            Integer cur = it.next();
            Assertions.assertThat(cur).isGreaterThan(pivot);
        }
    }
}