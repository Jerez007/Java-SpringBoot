package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired // This instantiates studentService and injected into the constructor.
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    // This is the API layer
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
