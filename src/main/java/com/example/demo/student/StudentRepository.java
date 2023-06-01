package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// This acts as the database layer. It is responsible for data access.
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Custom function to write user by email
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
