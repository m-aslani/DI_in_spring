package com.example.demo.initialSpring.xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_xml.xml");

        Display display = (Display) context.getBean("display");
        display.display();
    }
}
