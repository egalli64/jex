/*
  CodingBat Map 1 - https://codingbat.com/java/Map-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map1;

import java.util.Map;

/**
 * topping3 - https://codingbat.com/prob/p128461
 * <p>
 * If key "potato" is associated to a value, use it for the key "fries", too.
 * Same for "salad" and "spinach".
 */
public class Topping3 {
    /**
     * Just get and, if present, put both values as specified.
     *
     * @param map a map
     * @return the modified map
     */
    public static Map<String, String> solution(Map<String, String> map) {
        String potato = map.get("potato");
        if (potato != null) {
            map.put("fries", potato);
        }

        String salad = map.get("salad");
        if (salad != null) {
            map.put("spinach", salad);
        }

        return map;
    }
}
