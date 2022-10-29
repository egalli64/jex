/*
    Prepare > Algorithms > Implementation > ACM ICPC Team
    https://www.hackerrank.com/challenges/acm-icpc-team/problem

    Count 2 element groups with max number of or-ed value
 */
package com.hackerrank.algorithms.implementation;

import java.util.BitSet;
import java.util.List;
import java.util.TreeMap;

public class AcmIcpcTeam {
    private static BitSet fromBinaryString(String s) {
        BitSet bitset = new BitSet(s.length());
        for (int i = 0, len = s.length(); i < len; i++) {
            if (s.charAt(i) == '1') {
                bitset.set(i);
            }
        }
        return bitset;
    }

    public static List<Integer> acmTeam(List<String> topic) {
        List<BitSet> temp = topic.stream().map(AcmIcpcTeam::fromBinaryString).toList();
        TreeMap<Integer, Integer> counters = new TreeMap<>();

        for (int i = 0, sz = temp.size(); i < sz - 1; i++) {
            for (int j = i + 1; j < sz; j++) {
                BitSet cur = (BitSet) temp.get(i).clone();
                cur.or(temp.get(j));
                int key = cur.cardinality();
                Integer value = counters.putIfAbsent(key, 1);
                if (value != null) {
                    counters.put(key, value + 1);
                }
            }
        }
        var biggest = counters.lastEntry();
        return List.of(biggest.getKey(), biggest.getValue());
    }
}
