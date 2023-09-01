/*
  CodingBat Map 1 - https://codingbat.com/java/Map-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map1;

import java.util.Map;

/**
 * mapBully - https://codingbat.com/prob/p197888
 * <p>
 * If the passed map has an entry with key "a", put its value in the entry
 * having key "b", and reset the value for "a" as an empty string.
 */
public class MapBully {
    /**
     * Put the values only there is an "a" among the keys.
     *
     * @param map a map
     * @return the changed map
     */
    public static Map<String, String> solution(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
