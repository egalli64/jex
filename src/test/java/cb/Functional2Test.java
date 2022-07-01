package cb;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Functional2Test {
    @Test
    void noNegExample1() {
        List<Integer> input = List.of(1, -2);
        List<Integer> expected = List.of(1);

        Assertions.assertThat(Functional2.noNeg(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void noZExample1() {
        List<String> input = List.of("aaa", "bbb", "aza");
        List<String> expected = List.of("aaa", "bbb");

        Assertions.assertThat(Functional2.noZ(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void noYYExample1() {
        List<String> input = List.of("a", "b", "c");
        List<String> expected = List.of("ay", "by", "cy");

        Assertions.assertThat(Functional2.noYY(input)).containsExactlyElementsOf(expected);
    }

}