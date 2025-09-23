/*
 * 165. Compare Version Numbers - https://leetcode.com/problems/compare-version-numbers/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given two dot-separated version, compare them for natural order.
 * They could have different number of components, ignore zeroes.
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int end = Math.min(v1.length, v2.length);
        for (int i = 0; i < end; i++) {
            int left = Integer.parseInt(v1[i]);
            int right = Integer.parseInt(v2[i]);

            if (left < right) {
                return -1;
            } else if (right < left) {
                return 1;
            }
        }

        if (v1.length != v2.length) {
            String[] longer = v1.length > v2.length ? v1 : v2;
            String[] shorter = v1.length < v2.length ? v1 : v2;

            for (int i = shorter.length; i < longer.length; i++) {
                if (Integer.parseInt(longer[i]) > 0) {
                    return longer == v1 ? 1 : -1;
                }
            }
        }

        return 0;
    }
}
