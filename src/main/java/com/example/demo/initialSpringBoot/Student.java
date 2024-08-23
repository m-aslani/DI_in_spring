package com.example.demo.initialSpringBoot;


import org.springframework.stereotype.Service;

@Service
public class Student {

    private String name;
    private int[] marks = new int[3];

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
}
