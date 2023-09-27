/*
  CodingBat Map 1 - https://codingbat.com/java/Map-1

  My repository with solutions - https://github.com/egalli64/jex/
 */
package com.codingbat.map1;

import java.util.Map;

/**
 * topping2 - https://codingbat.com/prob/p196458
 * <p>
 * If key "ice cream" is associated to a value, use it for the key "yogurt",
 * too. If key "spinach" has a value, change it to "nuts".
 */
public class Topping2 {
    /**
     * Map::put for yogurt, if ice cream has a value. Map::replace spinach with the
     * value nuts.
     *
     * @param map a map
     * @return the changed map
     */
    public static Map<String, String> solution(Map<String, String> map) {
        String value = map.get("ice cream");
        if (value != null) {
            map.put("yogurt", value);
        }
        map.replace("spinach", "nuts");

        return map;
    }

    public static Map<String, String> classic(Map<String, String> map) {
        String value = map.get("ice cream");
        if (value != null) {
            map.put("yogurt", value);
        }

        String key = "spinach";
        if (map.containsKey(key)) {
            map.put(key, "nuts");
        }

        return map;
    }
}
