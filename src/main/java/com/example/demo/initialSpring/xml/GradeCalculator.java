package com.example.demo.initialSpring.xml;

public class GradeCalculator {

    public int calculate(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        total = total / marks.length;
        return total;
    }
}
