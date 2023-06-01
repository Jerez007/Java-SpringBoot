package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This acts as the database layer. It is responsible for data access.
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
