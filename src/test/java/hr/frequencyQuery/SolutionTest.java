package hr.frequencyQuery;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sample0() {
        var expected = List.of(0, 1);
        var actual = Solution.freqQuery(List.of(List.of(1, 5), List.of(1, 6), List.of(3, 2), List.of(1, 10),
                List.of(1, 10), List.of(1, 6), List.of(2, 5), List.of(3, 2)));

        assertThat(actual, is(expected));
    }

    @Test
    void sample1() {
        var expected = List.of(0, 1, 1);
        var actual = Solution.freqQuery(List.of(List.of(1, 3), List.of(2, 3), List.of(3, 2), List.of(1, 4),
                List.of(1, 5), List.of(1, 5), List.of(1, 4), List.of(3, 2), List.of(2, 4), List.of(3, 2)));

        assertThat(actual, is(expected));
    }

    @Test
    void freqQueryAdd() {
        var expected = List.of(1, 1, 1);
        var actual = Solution.freqQuery(List.of( //
                List.of(1, 42), List.of(3, 1), List.of(1, 42), List.of(3, 2), List.of(1, 42), List.of(3, 3)));

        assertThat(actual, is(expected));
    }

    @Test
    void freqQueryAddRemove() {
        var expected = List.of(1, 0);
        var actual = Solution.freqQuery(List.of( //
                List.of(1, 42), List.of(1, 42), List.of(1, 42), List.of(3, 3), //
                List.of(2, 42), List.of(2, 42), List.of(2, 42), List.of(3, 3) //
        )); //

        assertThat(actual, is(expected));
    }

    @Test
    void freqQueryRemoveAdd() {
        var expected = List.of(1);
        var actual = Solution.freqQuery(List.of(List.of(2, 42), List.of(1, 42), List.of(1, 42), List.of(3, 2)));

        assertThat(actual, is(expected));
    }
}
