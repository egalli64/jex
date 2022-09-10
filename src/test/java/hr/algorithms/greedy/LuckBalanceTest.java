package hr.algorithms.greedy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LuckBalanceTest {
    @Test
    void luckBalanceExampleK2() {
        List<List<Integer>> input = List.of(List.of(5, 1), List.of(1, 1), List.of(4, 0));
        int actual = LuckBalance.luckBalance(2, input);
        Assertions.assertThat(actual).isEqualTo(10);
    }

    @Test
    void luckBalanceExampleK1() {
        List<List<Integer>> input = List.of(List.of(5, 1), List.of(1, 1), List.of(4, 0));
        int actual = LuckBalance.luckBalance(1, input);
        Assertions.assertThat(actual).isEqualTo(8);
    }

    @Test
    void luckBalanceSample0() {
        List<List<Integer>> input = List.of(List.of(5, 1), List.of(2, 1), List.of(1, 1), List.of(8, 1), //
                List.of(10, 0), List.of(5, 0));
        int actual = LuckBalance.luckBalance(3, input);
        Assertions.assertThat(actual).isEqualTo(29);
    }

    @Test
    void luckBalanceSample1() {
        List<List<Integer>> input = List.of(List.of(13, 1), List.of(10, 1), List.of(9, 1), List.of(8, 1), //
                List.of(13, 1), List.of(12, 1), List.of(18, 1), List.of(13, 1));
        int actual = LuckBalance.luckBalance(5, input);
        Assertions.assertThat(actual).isEqualTo(42);
    }
}