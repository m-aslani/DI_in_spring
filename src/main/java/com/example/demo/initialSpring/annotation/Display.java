package com.example.demo.initialSpring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Display {

    private Student student ;
    private GradeCalculator gradeCalculator ;

    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }

    @Autowired
    public void setGradeCalculator(GradeCalculator gradeCalculator) {
        this.gradeCalculator = gradeCalculator;
    }

    Display(Student student, GradeCalculator gradeCalculator){
        student.setName("Masoumeh Aslani");
        student.setMarks(new int[]{15,16,17});
        this.student = student;
        this.gradeCalculator = gradeCalculator;
    }
    public void display(){
        System.out.println(gradeCalculator.calculate(student.getMarks()));
    }
}
