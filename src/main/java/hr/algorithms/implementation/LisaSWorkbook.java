/*
    Prepare > Algorithms > Implementation > Lisa's Workbook
    https://www.hackerrank.com/challenges/lisa-workbook/problem

    Given n chapters of exercises, as stored in arr
    In a page we have k exercises
    An exercise is "special" if its number is the same of the page number
    Count them
 */
package hr.algorithms.implementation;

import java.util.List;

public class LisaSWorkbook {
    public static int workbook(int n, int k, List<Integer> arr) {
        int result = 0;
        int page = 1;

        for (int nrProbForChapter: arr) {
            for (int i = 1; i <= nrProbForChapter; i++) {
                if (i == page) {
                    result += 1;
                }

                if ((i % k == 0) || i == nrProbForChapter) {
                    page += 1;
                }
            }
        }
        return result;
    }
}
