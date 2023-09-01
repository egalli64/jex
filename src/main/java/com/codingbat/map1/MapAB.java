/*
  CodingBat Map 1 - https://codingbat.com/java/Map-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map1;

import java.util.Map;

/**
 * mapAB - https://codingbat.com/prob/p107259
 * <p>
 * If the passed map has both pair with key "a" and "b", concatenate their
 * values and put the result as value for the key "ab"
 */
public class MapAB {
    /**
     * Put the value in ab only if both a and b are present
     *
     * @param map a map
     * @return the modified map
     */
    public static Map<String, String> solution(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");
        if (a != null && b != null) {
            map.put("ab", a + b);
        }

        return map;
    }
}
