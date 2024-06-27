/*
 * 1791. Find Center of Star Graph - https://leetcode.com/problems/find-center-of-star-graph/description/
 * LeetCode Easy Problems - https://leetcode.com/problemset/?difficulty=EASY
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.easy;

/**
 * Given an undirected star graph with n nodes [1..n], find its center.
 * 
 * Constraint: the given edges represent a valid star graph, it should have at
 * least three nodes and exactly n-1 edges.
 */
public class StarGraphCenter {
    /**
     * For the constraints, it is enough to check the first two edges and return the
     * label appearing in both of them.
     * 
     * @param edges the star graph edges
     * @return the label of the central node
     */
    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}
