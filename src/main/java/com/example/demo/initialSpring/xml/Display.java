package com.example.demo.initialSpring.xml;

public class Display {

    private Student student ;
    private GradeCalculator gradeCalculator ;


    Display(Student student, GradeCalculator gradeCalculator){
        this.student = student;
        this.gradeCalculator = gradeCalculator;
    }
    public void display(){
        System.out.println(gradeCalculator.calculate(student.getMarks()));
    }

//    public void setStudent(Student student) {
//    }
//
//    public void setGradeCalculator(GradeCalculator gradeCalculator) {
//    }
}
