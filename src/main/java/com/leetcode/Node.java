/*
 * LeetCode https://leetcode.com/problemset/
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode;

import java.util.List;
import java.util.Objects;

/**
 * A simple n-ary tree used in a few LeetCode problems
 * 
 * As the original design, the data member are public (yuck!), as the
 * constructors.
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }

    @Override
    public int hashCode() {
        return Objects.hash(children, val);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node other = (Node) obj;
        return Objects.equals(children, other.children) && val == other.val;
    }

    @Override
    public String toString() {
        return "Node [val=" + val + ", children=" + children + "]";
    }
}
