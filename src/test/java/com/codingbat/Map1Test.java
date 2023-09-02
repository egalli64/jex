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