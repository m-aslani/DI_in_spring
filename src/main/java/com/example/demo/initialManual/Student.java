package com.example.demo.initialManual;

public class Student {

    private String name;
    private int[] marks = new int[3];

    public Student(String name,int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }
}
