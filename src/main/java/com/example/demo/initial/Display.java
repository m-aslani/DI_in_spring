package com.example.demo.initial;

public class Display {

    private Student student = new Student("Masoumeh Aslani", new int[]{16, 17, 18});
    private GradeCalculator gradeCalculator = new GradeCalculator();

    public void display(){
        System.out.println(gradeCalculator.calculate(student.getMarks()));
    }
}
