package com.example.demo.initialSpringBoot;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final ApplicationContext context;

    public Application(ApplicationContext context) {
        this.context = context;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Display display = context.getBean(Display.class);
        display.display();
    }
}
