/*
 * HackerRank - Java - Advanced - Java Reflection Attributes
 * https://www.hackerrank.com/challenges/java-reflection-attributes/problem
 */
package hr.advanced.reflectionAttributes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    private static void classic() {
        Method[] methods = Student.class.getDeclaredMethods();

        List<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }

        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }

    private static void modern() {
        Stream.of(Student.class.getDeclaredMethods()) //
                .map(Method::getName) //
                .sorted() //
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("classic solution:");
        classic();
        System.out.println("modern solution:");
        modern();
    }
}
