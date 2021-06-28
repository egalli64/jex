/*
 * Practice - Interview Preparation Kit - Sorting - Fraudulent Activity Notifications
 * Practice - Algorithms - Sorting - Fraudulent Activity Notifications
 *
 * https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem
 */
package hr.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FraudulentActivity {
    /**
     * checking the previous d days,
     * an alert is raised if the current expenditure is >= 2 * median
     *
     * @param expenditures expenses day by day
     * @param d            rolling window size
     * @return number of alerts raised
     */
    public static int activityNotifications(List<Integer> expenditures, int d) {
        if (expenditures == null || d == 0 || expenditures.size() <= d) {
            return 0;
        }

        List<Integer> window = new ArrayList<>(expenditures.subList(0, d));
        window.sort(null);

        int result = 0;
        for (int i = d; i < expenditures.size(); i++) {
            Integer current = expenditures.get(i);
            if (fraudAlert(window, current)) {
                result += 1;
            }
            move(window, expenditures.get(i - d), current);
        }

        return result;
    }

    private static int lowerBound(List<Integer> sorted, Integer target) {
        int begin = 0;
        int end = sorted.size() - 1;

        while (begin <= end) {
            int middle = (begin + end) / 2;

            Integer current = sorted.get(middle);
            if (current < target) {
                begin = middle + 1;
            } else if (current > target){
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return end + 1;
    }

    private static void move(List<Integer> window, Integer exiting, Integer entering) {
        int posExit = Collections.binarySearch(window, exiting);
        if (posExit == -1) {
            throw new IllegalStateException("Can't find " + exiting + " in window");
        }
        int posEnter = lowerBound(window, entering);

        if (posEnter > posExit) {
            window.add(posEnter, entering);
            window.remove(posExit);
        } else if (posExit > posEnter) {
            window.remove(posExit);
            window.add(posEnter, entering);
        } else {
            window.set(posExit, entering);
        }
    }

    private static boolean fraudAlert(List<Integer> window, Integer current) {
        int size = window.size();
        double median = window.get(size / 2);
        return current >= ((size > 1 && size % 2 == 0) ? (median + window.get(size / 2 - 1)) : median * 2);
    }
}
