/*
 * 36. Valid Sudoku - https://leetcode.com/problems/valid-sudoku/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium;

import java.util.Arrays;
import java.util.BitSet;

/**
 * Check if the passed board represents a valid turn in a sudoku game
 * Values are in [1..9], a dot means no value
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        BitSet[] rows = new BitSet[9];
        Arrays.setAll(rows, i -> new BitSet(9));
        BitSet[] columns = new BitSet[9];
        Arrays.setAll(columns, i -> new BitSet(9));
        BitSet[] boxes = new BitSet[9];
        Arrays.setAll(boxes, i -> new BitSet(9));

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int cur = board[i][j] - '1';
                    int k = (i / 3) * 3 + (j / 3);

                    if (rows[i].get(cur) || columns[j].get(cur) || boxes[k].get(cur)) {
                        return false;
                    }

                    rows[i].set(cur);
                    columns[j].set(cur);
                    boxes[k].set(cur);
                }
            }
        }
        return true;
    }
}
