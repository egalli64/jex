package cb;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Array1Test {
    @Test
    void firstLast6Example1() {
        int[] input = { 1, 2, 6 };
        assertThat(Array1.firstLast6(input)).isTrue();
    }

    @Test
    void firstLast6Example2() {
        int[] input = { 6, 1, 2, 3 };
        assertThat(Array1.firstLast6(input)).isTrue();
    }

    @Test
    void firstLast6Example3() {
        int[] input = { 13, 6, 1, 2, 3 };
        assertThat(Array1.firstLast6(input)).isFalse();
    }

    @Test
    void commonEndExample1() {
        int[] first = { 1, 2, 3 };
        int[] second = { 7, 3 };
        assertThat(Array1.commonEnd(first, second)).isTrue();
    }

    @Test
    void commonEndExample2() {
        int[] first = { 1, 2, 3 };
        int[] second = { 7, 3, 2 };
        assertThat(Array1.commonEnd(first, second)).isFalse();
    }

    @Test
    void commonEndExample3() {
        int[] first = { 1, 2, 3 };
        int[] second = { 1, 3 };
        assertThat(Array1.commonEnd(first, second)).isTrue();
    }

    @Test
    void reverse3Example1() {
        int[] input = { 1, 2, 3 };
        int[] expected = { 3, 2, 1 };
        assertThat(Array1.reverse3(input)).containsExactly(expected);
    }

    @Test
    void reverse3Example2() {
        int[] input = { 5, 11, 9 };
        int[] expected = { 9, 11, 5 };
        assertThat(Array1.reverse3(input)).containsExactly(expected);
    }

    @Test
    void reverse3Example3() {
        int[] input = { 7, 0, 0 };
        int[] expected = { 0, 0, 7 };
        assertThat(Array1.reverse3(input)).containsExactly(expected);
    }

    @Test
    void middleWayExample1() {
        int[] left = { 1, 2, 3 };
        int[] right = { 4, 5, 6 };
        int[] expected = { 2, 5 };
        assertThat(Array1.middleWay(left, right)).containsExactly(expected);
    }

    @Test
    void no23Example1() {
        int[] input = { 4, 5 };
        assertThat(Array1.no23(input)).isTrue();
    }

    @Test
    void fix23Example1() {
        int[] input = { 1, 2, 3 };
        int[] expected = { 1, 2, 0 };
        assertThat(Array1.fix23(input)).containsExactly(expected);
    }

    @Test
    void makeMiddleExample1() {
        int[] input = { 1, 2, 3, 4 };
        int[] expected = { 2, 3 };
        assertThat(Array1.makeMiddle(input)).containsExactly(expected);
    }

    @Test
    void midThreeExample1() {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] expected = { 2, 3, 4 };
        assertThat(Array1.midThree(input)).containsExactly(expected);
    }

    @Test
    void unlucky1Example1() {
        int[] input = { 1, 3, 4, 5 };
        assertThat(Array1.unlucky1(input)).isTrue();
    }

    @Test
    void sameFirstLastExample1() {
        int[] input = { 1, 2, 3 };
        assertThat(Array1.sameFirstLast(input)).isFalse();
    }

    @Test
    void makePiExample1() {
        int[] expected = { 3, 1, 4 };
        assertThat(Array1.makePi()).containsExactly(expected);
    }

    @Test
    void sum3Example1() {
        int[] input = { 1, 2, 3 };
        int expected = 6;
        assertThat(Array1.sum3(input)).isEqualTo(expected);
    }

    @Test
    void rotateLeft3Example1() {
        int[] input = { 1, 2, 3 };
        int[] expected = { 2, 3, 1 };
        assertThat(Array1.rotateLeft3(input)).containsExactly(expected);
    }

    @Test
    void maxEnd3Example1() {
        int[] input = { 1, 2, 3 };
        int[] expected = { 3, 3, 3 };
        assertThat(Array1.maxEnd3(input)).containsExactly(expected);
    }

    @Test
    void sum2Example1() {
        int[] input = { 1, 2, 3 };
        int expected = 3;
        assertThat(Array1.sum2(input)).isEqualTo(expected);
    }

    @Test
    void makeEndsExample1() {
        int[] input = { 1, 2, 3 };
        int[] expected = { 1, 3 };
        assertThat(Array1.makeEnds(input)).containsExactly(expected);
    }

    @Test
    void has23Example1() {
        int[] input = { 2, 5 };
        assertThat(Array1.has23(input)).isTrue();
    }

    @Test
    void makeLastExample1() {
        int[] input = { 4, 5, 6 };
        int[] expected = { 0, 0, 0, 0, 0, 6 };
        assertThat(Array1.makeLast(input)).containsExactly(expected);
    }

    @Test
    void double23Example1() {
        int[] input = { 2, 2 };
        assertThat(Array1.double23(input)).isTrue();
    }

    @Test
    void start1Example1() {
        int[] first = { 1, 2, 3 };
        int[] second = { 1, 3 };
        int expected = 2;
        assertThat(Array1.start1(first, second)).isEqualTo(expected);
    }

    @Test
    void biggerTwoExample1() {
        int[] first = { 1, 2 };
        int[] second = { 3, 4 };
        int[] expected = second;
        assertThat(Array1.biggerTwo(first, second)).isEqualTo(expected);
    }

    @Test
    void plusTwoExample1() {
        int[] first = { 1, 2 };
        int[] second = { 3, 4 };
        int[] expected = { 1, 2, 3, 4 };
        assertThat(Array1.plusTwo(first, second)).isEqualTo(expected);
    }

    @Test
    void swapEndsExample1() {
        int[] input = { 1, 2, 3, 4 };
        int[] expected = { 4, 2, 3, 1 };
        assertThat(Array1.swapEnds(input)).isEqualTo(expected);
    }

    @Test
    void maxTripleExample1() {
        int[] input = { 1, 2, 3 };
        int expected = 3;
        assertThat(Array1.maxTriple(input)).isEqualTo(expected);
    }

    @Test
    void frontPieceExample1() {
        int[] input = { 1, 2, 3 };
        int[] expected = { 1, 2 };
        assertThat(Array1.frontPiece(input)).isEqualTo(expected);
    }

    @Test
    void make2Example1() {
        int[] first = { 4, 5 };
        int[] second = { 1, 2, 3 };
        int[] expected = { 4, 5 };
        assertThat(Array1.make2(first, second)).isEqualTo(expected);
    }

    @Test
    void front11Example1() {
        int[] first = { 1, 2, 3 };
        int[] second = { 7, 9, 8 };
        int[] expected = { 1, 7 };
        assertThat(Array1.front11(first, second)).isEqualTo(expected);
    }
}