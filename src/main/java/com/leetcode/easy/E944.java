/*
 * 944. Delete Columns to Make Sorted
 * https://leetcode.com/problems/delete-columns-to-make-sorted/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Think the string array in input as a rectangular [a-z] char matrix.
 * Count the columns that are not in order.
 */
class E944 {
    /**
     * Smoke Test
     */
    static void main() {
        E944 x = new E944();

        System.out.println(x.minDeletionSize(new String[]{"cba", "daf", "ghi"}) == 1);
        System.out.println(x.minDeletionSize(new String[]{"a", "b"}) == 0);
        System.out.println(x.minDeletionSize(new String[]{"zyx", "wvu", "tsr"}) == 3);
    }

    public int minDeletionSize(String[] strs) {
        int result = 0;

        for (int j = 0; j < strs[0].length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) < strs[i - 1].charAt(j)) {
                    result += 1;
                    break;
                }
            }
        }

        return result;
    }
}
