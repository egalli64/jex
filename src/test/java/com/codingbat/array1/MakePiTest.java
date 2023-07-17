/*
  CodingBat Java Array 1 - https://codingbat.com/java/Array-1

  My repo - https://github.com/egalli64/jex/
 */
package com.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MakePiTest {
    @Test
    void makePiExample1() {
        int[] expected = { 3, 1, 4 };
        assertThat(MakePi.solution()).containsExactly(expected);
    }
}
