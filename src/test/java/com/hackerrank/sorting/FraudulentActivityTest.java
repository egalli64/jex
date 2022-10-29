package com.hackerrank.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class FraudulentActivityTest {
    @Test
    void activityNotificationsGiven0() {
        int expected = 2;
        int actual = FraudulentActivity.activityNotifications(Arrays.asList(2, 3, 4, 2, 3, 6, 8, 4, 5), 5);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void activityNotificationsGiven1() {
        int expected = 0;
        int actual = FraudulentActivity.activityNotifications(Arrays.asList(1, 2, 3, 4, 4), 4);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void activityNotificationsGiven2() {
        int expected = 1;
        int actual = FraudulentActivity.activityNotifications(Arrays.asList(10, 20, 30, 40, 50), 3);

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}