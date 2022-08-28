package hr.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class GemstonesTest {
    @Test
    void gemstonesSample() {
        List<String> input = List.of("abcdde", "baccd", "eeabg");
        int actual = Gemstones.gemstones(input);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void gemstones2Sample() {
        List<String> input = List.of("abcdde", "baccd", "eeabg");
        int actual = Gemstones.gemstones2(input);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void gemstones2Test2() {
        List<String> input = List.of("basdfj", "asdlkjfdjsa", "bnafvfnsd", "oafhdlasd");
        int actual = Gemstones.gemstones2(input);
        Assertions.assertThat(actual).isEqualTo(4);
    }
}