/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FirstLast6Test {
    @Test
    void firstLast6Example1() {
        int[] input = { 1, 2, 6 };
        assertThat(FirstLast6.solution(input)).isTrue();
    }

    @Test
    void firstLast6Example2() {
        int[] input = { 6, 1, 2, 3 };
        assertThat(FirstLast6.solution(input)).isTrue();
    }

    @Test
    void firstLast6Example3() {
        int[] input = { 13, 6, 1, 2, 3 };
        assertThat(FirstLast6.solution(input)).isFalse();
    }
}
