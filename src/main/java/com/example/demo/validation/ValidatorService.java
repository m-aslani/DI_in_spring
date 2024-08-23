package com.example.demo.validation;

import com.example.demo.validation.exception.EmailValidationException;
import com.example.demo.validation.exception.PasswordValidationException;
import com.example.demo.validation.exception.UsernameValidationException;
import jakarta.validation.*;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ValidatorService {
    private Validator validator;
    public ValidatorService(Validator validator) {
        this.validator = validator;
    }

    public void validate(Input input) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Input>> constraintViolations = validator.validate(input);

        if (!constraintViolations.isEmpty()) {

            for (ConstraintViolation<Input> violation : constraintViolations) {
                String propertyPath = violation.getPropertyPath().toString();
                String message = violation.getMessage();

                switch (propertyPath) {
                    case "username":
                        throw new UsernameValidationException("Invalid username: " + message);
                    case "password":
                        throw new PasswordValidationException("Invalid password: " + message);
                        case "email":
                            throw new EmailValidationException("Invalid email: " + message);
                    default:
//                        throw new ConstraintViolationException(constraintViolations);
                        System.out.println("Invalid property: " + propertyPath);
                }
            }
        } else {
            System.out.println("Validation passed");
        }
    }
}
