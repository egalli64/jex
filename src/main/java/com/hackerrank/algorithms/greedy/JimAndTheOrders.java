/*
 * Prepare > Algorithms > Greedy > Jim and the Orders
 * https://www.hackerrank.com/challenges/jim-and-the-orders/
 *
 * Given two lists of integer, order and time
 * Return a list of integers, index of the input lists, ordered by the sum of values
 *  In case of tie, the order number wins
 */
package com.hackerrank.algorithms.greedy;

import java.util.*;

public class JimAndTheOrders {
    public static List<Integer> jimOrders(List<List<Integer>> orders) {
        Map<Integer, Set<Integer>> map = new TreeMap<>();
        for (int i = 0; i < orders.size(); i++) {
            Integer serve = orders.get(i).get(0) + orders.get(i).get(1);
            map.computeIfAbsent(serve, k -> new TreeSet<>()).add(i + 1);
        }

        List<Integer> result = new ArrayList<>(orders.size());
        for (var entry : map.entrySet()) {
            result.addAll(entry.getValue());
        }
        return result;
    }

    public static List<Integer> jimOrdersStream(List<List<Integer>> orders) {
        Map<Integer, Integer> map = new HashMap<>(orders.size());
        for (int i = 0; i < orders.size(); i++) {
            map.put(i + 1, orders.get(i).get(0) + orders.get(i).get(1));
        }

        return map.entrySet().stream().sorted(Map.Entry.comparingByValue()) //
                .map(Map.Entry::getKey).toList();
    }
}
