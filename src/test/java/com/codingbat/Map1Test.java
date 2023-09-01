/*
  CodingBat Map 1 - https://codingbat.com/java/Map-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class Map1Test {
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

    @Test
    void topping3Example1() {
        Map<String, String> input = new HashMap<>();
        input.put("potato", "ketchup");
        Map<String, String> expected = Map.of("potato", "ketchup", "fries", "ketchup");

        assertThat(Map1.topping3(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void mapAB3Example1() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "aaa");
        input.put("c", "cake");
        Map<String, String> expected = Map.of("a", "aaa", "b", "aaa", "c", "cake");

        assertThat(Map1.mapAB3(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }

    @Test
    void mapAB4Example1() {
        Map<String, String> input = new HashMap<>();
        input.put("a", "aaa");
        input.put("b", "bb");
        input.put("c", "cake");
        Map<String, String> expected = Map.of("a", "aaa", "b", "bb", "c", "aaa");

        assertThat(Map1.mapAB4(input)).containsExactlyInAnyOrderEntriesOf(expected);
    }
}