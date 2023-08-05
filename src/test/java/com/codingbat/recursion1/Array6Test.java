/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Array6Test {
    @Test
    void array6Example1() {
        int[] input = {1, 6, 4};
        assertThat(Array6.array6(input, 0)).isTrue();
    }
}
