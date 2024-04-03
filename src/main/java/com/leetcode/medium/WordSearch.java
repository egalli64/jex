/*
 * 79. Word Search - https://leetcode.com/problems/word-search/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 * 
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

/**
 * Given a grid of characters, check if a word exists in a given grid
 * 
 * The word can be constructed from letters of horizontally or vertically
 * adjacent cells, the same letter cell may not be used more than once
 */
public class WordSearch {
    /** The possible moves on board */
    static private final int[][] MOVES = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

    /**
     * Start the recursion
     * 
     * @param board the board
     * @param word  the target
     * @return true if found
     */
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && recurse(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Recursive part of the algorithm
     * 
     * @param board the board
     * @param word  the target
     * @param i     position in board
     * @param j     position in board
     * @param k     position in string
     * @return true if found
     */
    boolean recurse(char[][] board, String word, int i, int j, int k) {
        if (k == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(k)) {
            return false;
        }

        board[i][j] = '\0';
        for (int[] move : MOVES) {
            if (recurse(board, word, i + move[0], j + move[1], k + 1)) {
                return true;
            }
        }

        board[i][j] = word.charAt(k);
        return false;
    }
}
