package com.example.demo.initialManual;


public class Application {
    public static void main(String[] args) {
        Student student = new Student("Masoumeh Aslani", new int[]{16, 17, 18});
        GradeCalculator gradeCalculator = new GradeCalculator();

        new Display(student,gradeCalculator).display();
    }
}
