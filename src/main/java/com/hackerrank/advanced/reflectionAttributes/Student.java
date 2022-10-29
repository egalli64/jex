/*
 * HackerRank - Java - Advanced - Java Reflection Attributes
 * https://www.hackerrank.com/challenges/java-reflection-attributes/problem
 */
package com.hackerrank.advanced.reflectionAttributes;

class Student {
    private final String name;
    private String id;
    private String email;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anotherMethod() {
        System.out.println(name + id + email);
    }
}
