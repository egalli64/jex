package cb;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class Map1Test {
    @Test
    void mapBullyExample1() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "candy");
        input.put("b", "dirt");
        Map<String, String> expected = Map.of("a", "", "b", "candy");

        assertThat(Map1.mapBully(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void mapBullyExample2() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "candy");
        Map<String, String> expected = Map.of("a", "", "b", "candy");

        assertThat(Map1.mapBully(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void mapBullyExample3() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "candy");
        input.put("b", "carrot");
        input.put("c", "meh");
        Map<String, String> expected = Map.of("a", "", "b", "candy", "c", "meh");

        assertThat(Map1.mapBully(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void topping1Example1() {
        Map<String, String> input = new HashMap<>();
        input.put("ice cream", "peanuts");
        Map<String, String> expected = Map.of("bread", "butter", "ice cream", "cherry");

        assertThat(Map1.topping1(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void topping1Example2() {
        Map<String, String> input = new HashMap<>();
        Map<String, String> expected = Map.of("bread", "butter");

        assertThat(Map1.topping1(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void topping1Example3() {
        Map<String, String> input = new HashMap<>();
        input.put("pancake", "syrup");
        Map<String, String> expected = Map.of("bread", "butter", "pancake", "syrup");

        assertThat(Map1.topping1(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void mapAB2Example1() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "aaa");
        input.put("b", "aaa");
        input.put("c", "cake");
        Map<String, String> expected = Map.of("c", "cake");

        assertThat(Map1.mapAB2(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void mapAB2Example2() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "aaa");
        input.put("b", "bbb");
        Map<String, String> expected = Map.of("a", "aaa", "b", "bbb");

        assertThat(Map1.mapAB2(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void mapShareExample1() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "aaa");
        input.put("b", "bbb");
        input.put("c", "ccc");
        Map<String, String> expected = Map.of("a", "aaa", "b", "aaa");

        assertThat(Map1.mapShare(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void mapABExample1() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "Hi");
        input.put("b", "There");
        Map<String, String> expected = Map.of("a", "Hi", "b", "There", "ab", "HiThere");

        assertThat(Map1.mapAB(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void topping2Example1() {
        Map<String, String> input = new HashMap<>();
        input.put("ice cream", "cherry");
        Map<String, String> expected = Map.of("yogurt", "cherry", "ice cream", "cherry");

        assertThat(Map1.topping2(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }
}