package com.example.demo.lifeCycle.config;

import com.example.demo.lifeCycle.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public Student student() {
        Student student = new Student();
        student.setName("Masoumeh Aslani");
        student.setMarks(new int[]{18,16,17});
        student.display();
        return student;
    }
}
