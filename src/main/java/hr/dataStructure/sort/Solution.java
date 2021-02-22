/*
 * HackerRank - Java - Data Structures - Java Sort
 * http://thisthread.blogspot.com/2018/06/hackerrank-java-sort.html
 * https://www.hackerrank.com/challenges/java-sort/problem
 *
 * Read strings from input, convert them to Student, order them by cgpa + first name + int, and print the names
 */
package hr.dataStructure.sort;

import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.ENGLISH); // ensure dot used in floating numbers

            int count = sc.nextInt();
            sc.nextLine();

            Stream.generate(() -> new Student(sc.nextInt(), sc.next(), sc.nextDouble()))
                    .limit(count)
                    .sorted(Comparator.comparingDouble(Student::getCgpa).reversed()
                            .thenComparing(Student::getName)
                            .thenComparingInt(Student::getId))
                    .map(Student::getName)
                    .forEach(System.out::println);
        }
    }
}