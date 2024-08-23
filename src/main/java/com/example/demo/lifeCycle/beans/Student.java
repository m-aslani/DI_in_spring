package com.example.demo.lifeCycle.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;

import java.util.Arrays;

public class Student implements BeanNameAware {
    private String name;
    private int[] marks = new int[3];
    private String beanName;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    public void display(){
        System.out.println(this.toString());
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware.setBeanName: " + name);
        this.beanName = name;
    }

    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct");
    }
    public void customInit() {
        System.out.println("in customInit");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("@preDestroy");
    }

    public void customDestroy() {
        System.out.println("in customDestroy");
    }
}
