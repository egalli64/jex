/*
 * LeetCode https://leetcode.com/problemset/
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode;

import java.util.Objects;

/**
 * A simple linked list used in a few LeetCode problems
 * <p>
 * The data member are public (yuck!) to be compatible with the original class.
 * They are package-private in LeetCode implementation
 * Since my version is in another package - required by my package structure,
 * each problem in a specific difficulty related package
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListNode other) {
            return Objects.equals(next, other.next) && val == other.val;
        } else {
            return false;
        }
    }

    /**
     * Added as debug helper
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        ListNode cur = this;
        do {
            sb.append(cur.val);
            sb.append(' ');
            cur = cur.next;
        } while (cur != null);
        sb.append(']');
        return sb.toString();
    }
}
