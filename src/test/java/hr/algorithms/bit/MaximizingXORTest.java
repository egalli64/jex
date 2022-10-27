package hr.algorithms.bit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MaximizingXORTest {
    @ParameterizedTest
    @CsvSource({"11,12,7", "10,15,7", "11,100,127"})
    void maximizingXorSamples(int left, int right, int expected) {
        int actual = MaximizingXOR.maximizingXor(left, right);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}