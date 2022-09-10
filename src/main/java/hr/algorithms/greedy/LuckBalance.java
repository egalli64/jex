/*
 * Prepare > Algorithms > Greedy > Luck Balance
 * https://www.hackerrank.com/challenges/luck-balance/
 *
 * Given a list of a list of couples [points / [0/1] (not) important] and k, how many important could lose
 * Losing makes result increase, winning makes it decrease
 * Maximise the result
 */
package hr.algorithms.greedy;

import java.util.*;

public class LuckBalance {
    public static int luckBalance(int k, List<List<Integer>> contests) {
        int result = 0;

        List<Integer> buffer = new ArrayList<>();
        for (var contest : contests) {
            int value = contest.get(0);
            if (contest.get(1) == 0) {
                result += value;
            } else {
                buffer.add(value);
            }
        }

        buffer.sort(Comparator.reverseOrder());

        k = Math.min(k, buffer.size());
        for (int i = 0; i < k; i++) {
            result += buffer.get(i);
        }
        for (int i = k; i < buffer.size(); i++) {
            result -= buffer.get(i);
        }

        return result;
    }
}
