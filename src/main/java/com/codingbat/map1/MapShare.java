/*
  CodingBat Map 1 - https://codingbat.com/java/Map-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map1;

import java.util.Map;

/**
 * mapShare - https://codingbat.com/prob/p148813
 * <p>
 * If the passed map has a value associated to the key "a", use it also for the
 * key "b". In any case remove the key "c".
 */
public class MapShare {
    /**
     * Check the value for key "a" before assign it to key "b"
     *
     * @param map a map
     * @return the modified map
     */
    public static Map<String, String> solution(Map<String, String> map) {
        String value = map.get("a");
        if (value != null) {
            map.put("b", value);
        }
        map.remove("c");
        return map;
    }
}
