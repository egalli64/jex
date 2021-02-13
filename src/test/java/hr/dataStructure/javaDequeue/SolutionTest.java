/*
 * HackerRank - Java - Data Structures - Java Dequeue
 *
 * @author: Manny egalli64@gmail.com
 * @see:    https://thisthread.blogspot.com/2018/07/hackerrank-java-dequeue.html
 *          https://www.hackerrank.com/challenges/java-dequeue/problem
 * <p>
 * n = total number of integers
 * m = window size
 * calculate the highest number of unique elements in any window
 */
package hr.dataStructure.javaDequeue;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSolutionPlain() {
        String data = "5 3\n1 2 2 3 3 3";
        InputStream is = new ByteArrayInputStream(data.getBytes());
        assertThat(Solution.solution(is), is(2));
    }

    @Test
    void testSolutionAll() {
        String data = "5 3\n1 2 2 3 4 5";
        InputStream is = new ByteArrayInputStream(data.getBytes());
        assertThat(Solution.solution(is), is(3));
    }

    @Test
    void testSolutionSimple() {
        String data = "5 3\n1 2 6 3 4 5";
        InputStream is = new ByteArrayInputStream(data.getBytes());
        assertThat(Solution.solution(is), is(3));
    }

    @Test
    void testSolutionOne() {
        String data = "5 3\n1 1 1 1 1 1";
        InputStream is = new ByteArrayInputStream(data.getBytes());
        assertThat(Solution.solution(is), is(1));
    }

    @Test
    void testSolutionWindowTooBig() {
        String data = "3 5\n1 2 2 3 3 3";
        InputStream is = new ByteArrayInputStream(data.getBytes());
        assertThrows(AssertionError.class, () -> Solution.solution(is));
    }
}
