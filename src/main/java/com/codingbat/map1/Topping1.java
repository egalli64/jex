/*
  CodingBat Map 1 - https://codingbat.com/java/Map-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map1;

import java.util.Map;

/**
 * topping1 - https://codingbat.com/prob/p182712
 * <p>
 * If the passed map has an entry with key "ice cream", set its value to
 * "cherry". In any case set on the key "bread" the value "butter".
 */
public class Topping1 {
    /**
     * Call Map::replace for the ice cream (change value only if mapped) and
     * Map::put for bread.
     *
     * @param map a map
     * @return the modified map
     */
    public static Map<String, String> solution(Map<String, String> map) {
        map.replace("ice cream", "cherry");
        map.put("bread", "butter");

        return map;
    }

    /**
     * Put cherry as value for ice cream only if it is already in the map. Always
     * put bread/butter.
     * 
     * @param map a map
     * @return the modified map
     */
    public static Map<String, String> classic(Map<String, String> map) {
        String toBeChanged = "ice cream";
        if (map.containsKey(toBeChanged)) {
            map.put(toBeChanged, "cherry");
        }
        map.put("bread", "butter");

        return map;
    }
}
