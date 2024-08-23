package com.example.demo.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class validationApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(validationApplication.class,args);

        Input input = new Input("","123","masoumeh.aslani@gmail.com");

        var validator = applicationContext.getBean(ValidatorService.class);
        validator.validate(input);
    }
}
