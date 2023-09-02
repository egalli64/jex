/*
  CodingBat Map 1 - https://codingbat.com/java/Map-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map1;

import java.util.Map;

/**
 * mapAB2 - https://codingbat.com/prob/p115011
 * <p>
 * If the keys "a" and "b" are both in the input map and have the same value,
 * remove them
 */
public class MapAB2 {
    /**
     * Check by containsKey, compare the values, if same, remove both entries.
     *
     * @param map a map
     * @return the changed map
     */
    public static Map<String, String> solution(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}
