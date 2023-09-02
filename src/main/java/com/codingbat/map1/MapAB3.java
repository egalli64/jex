/*
  CodingBat Map 1 - https://codingbat.com/java/Map-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map1;

import java.util.Map;

/**
 * mapAB3 - https://codingbat.com/prob/p115012
 * <p>
 * If only one between keys "a" or "b" is present in the input map, set the
 * value of the missing one using the existing one.
 */
public class MapAB3 {
    /**
     * Get both a and b value, put the missing one, if the other exists.
     *
     * @param map a map
     * @return the changed map
     */
    public static Map<String, String> solution(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");

        if (a != null && b == null) {
            map.put("b", a);
        }
        if (a == null && b != null) {
            map.put("a", b);
        }

        return map;
    }
}
