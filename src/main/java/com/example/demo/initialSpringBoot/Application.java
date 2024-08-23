package com.example.demo.initialSpring.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");

        Display display = context.getBean(Display.class);
        display.display();
    }
}
