package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student homer = new Student(
                    "Homer",
                    "homer.simpson@gmail.com",
                    LocalDate.of(1950, 1, 5)
            );

            Student marge = new Student(
                    "Marge",
                    "marge.simpson@gmail.com",
                    LocalDate.of(1950, 12, 5)
            );

            // Save to our database
            repository.saveAll(List.of(homer, marge));
        };
    }
}
