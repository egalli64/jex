package cb;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

class Map2Test {
    @Test
    void word0Example1() {
        String[] input = {"a", "b", "a", "b"};
        Map<String, Integer> expected = Map.of("a", 0, "b", 0);

        Assertions.assertThat(Map2.word0(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void wordCountExample1() {
        String[] input = {"a", "b", "a", "c", "b"};
        Map<String, Integer> expected = Map.of("a", 2, "b", 2, "c", 1);

        Assertions.assertThat(Map2.wordCount(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void wordMultipleExample1() {
        String[] input = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> expected = Map.of("a", true, "b", true, "c", false);

        Assertions.assertThat(Map2.wordMultiple(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }
}