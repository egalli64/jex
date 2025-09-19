/*
 * 3484. Design Spreadsheet - https://leetcode.com/problems/design-spreadsheet/description/
 * LeetCode Medium Problems - https://leetcode.com/problemset/?difficulty=MEDIUM
 *
 * My repository with solutions - https://github.com/egalli64/jex/
 */
package com.leetcode.medium.designSpreadsheet;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Spreadsheet has 26 columns: A ... Z, and the input number of rows.
 * Each cell contains an integer initialized to zero.
 * The cell key is in the format "Xn"
 * It allows a calculation by a formula in the format "=x+y" where each operand could be an integer or a cell
 */
class Spreadsheet {
    private static final Pattern PATTERN_PLUS = Pattern.compile("=(.*)\\+(.*)");
    private final Map<String, Integer> values;

    public Spreadsheet(int rows) {
        this.values = new HashMap<>();
    }

    public void setCell(String cell, int value) {
        values.put(cell, value);
    }

    public void resetCell(String cell) {
        values.put(cell, 0);
    }

    public int getValuePattern(String formula) {
        Matcher matcher = PATTERN_PLUS.matcher(formula);
        if (matcher.matches()) {
            String left = matcher.group(1);
            String right = matcher.group(2);

            int result = Character.isDigit(left.charAt(0)) ? Integer.parseInt(left) : values.getOrDefault(left, 0);
            result += Character.isDigit(right.charAt(0)) ? Integer.parseInt(right) : values.getOrDefault(right, 0);
            return result;
        } else {
            return 0;
        }
    }

    public int getValue(String formula) {
        int plus = formula.indexOf('+');
        String left = formula.substring(1, plus);
        String right = formula.substring(plus + 1);

        int result = Character.isDigit(left.charAt(0)) ? Integer.parseInt(left) : values.getOrDefault(left, 0);
        result += Character.isDigit(right.charAt(0)) ? Integer.parseInt(right) : values.getOrDefault(right, 0);
        return result;
    }
}

class SmokeTest {
    static void main() {
        Spreadsheet spreadsheet = new Spreadsheet(3);

        if (spreadsheet.getValue("=5+7") != 12) {
            System.err.println("Trouble (12)!");
        }

        spreadsheet.setCell("A1", 10);
        if (spreadsheet.getValue("=A1+6") != 16) {
            System.err.println("Trouble (16)!");
        }

        spreadsheet.setCell("B2", 15);
        if (spreadsheet.getValue("=A1+B2") != 25) {
            System.err.println("Trouble (25)!");
        }

        spreadsheet.resetCell("A1");
        if (spreadsheet.getValue("=A1+B2") != 15) {
            System.err.println("Trouble (15)!");
        }

        if (spreadsheet.getValuePattern("=A1+B2") != 15) {
            System.err.println("Trouble (15)!");
        }

        System.out.println("Done");
    }
}
