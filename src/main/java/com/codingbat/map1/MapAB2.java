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
     * Get the values, if not null and same, remove both entries.
     *
     * @param map a map
     * @return the changed map
     */
    public static Map<String, String> solution(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");

        if (a != null && a.equals(b)) {
            map.remove("a");
            map.remove("b");
        }

        return map;
    }
}
