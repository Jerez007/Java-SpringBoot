package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service // This class is meant to be a service class
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Homer",
                        "homer.simpson@gmail.com",
                        LocalDate.of(1950, 1, 5),
                        21
                )
        );
    }
}
