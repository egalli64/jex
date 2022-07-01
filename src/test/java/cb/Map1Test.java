package cb;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class Map1Test {
    @Test
    void mapBullyExample1() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "candy");
        input.put("b", "dirt");
        Map<String, String> expected = Map.of("a", "", "b", "candy");

        Assertions.assertThat(Map1.mapBully(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void mapBullyExample2() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "candy");
        Map<String, String> expected = Map.of("a", "", "b", "candy");

        Assertions.assertThat(Map1.mapBully(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void mapBullyExample3() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "candy");
        input.put("b", "carrot");
        input.put("c", "meh");
        Map<String, String> expected = Map.of("a", "", "b", "candy", "c", "meh");

        Assertions.assertThat(Map1.mapBully(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void topping1Example1() {
        Map<String, String> input = new HashMap<>();
        input.put("ice cream", "peanuts");
        Map<String, String> expected = Map.of("bread", "butter", "ice cream", "cherry");

        Assertions.assertThat(Map1.topping1(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void topping1Example2() {
        Map<String, String> input = new HashMap<>();
        Map<String, String> expected = Map.of("bread", "butter");

        Assertions.assertThat(Map1.topping1(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void topping1Example3() {
        Map<String, String> input = new HashMap<>();
        input.put("pancake", "syrup");
        Map<String, String> expected = Map.of("bread", "butter", "pancake", "syrup");

        Assertions.assertThat(Map1.topping1(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void mapAB2Example1() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "aaa");
        input.put("b", "aaa");
        input.put("c", "cake");
        Map<String, String> expected = Map.of("c", "cake");

        Assertions.assertThat(Map1.mapAB2(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void mapAB2Example2() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "aaa");
        input.put("b", "bbb");
        Map<String, String> expected = Map.of("a", "aaa", "b", "bbb");

        Assertions.assertThat(Map1.mapAB2(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

}