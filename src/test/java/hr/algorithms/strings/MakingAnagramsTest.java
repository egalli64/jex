package hr.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MakingAnagramsTest {
    @Test
    void makingAnagramsSample() {
        int actual = MakingAnagrams.makingAnagrams("cde", "abc");
        Assertions.assertThat(actual).isEqualTo(4);
    }
}