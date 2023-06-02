package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
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

    @PostMapping
    // The API to take payload and store it in the database
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    // The API to delete a student
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    // Updates a student info from the database
    @PutMapping(path = "{studentId}")
    public void updateStudent(
        @PathVariable("studentId") Long studentId,
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String email) {
        studentService.updateStudent(studentId, name, email);
    }
}
