package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

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
