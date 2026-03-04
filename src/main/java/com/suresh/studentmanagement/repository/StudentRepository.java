package com.suresh.studentmanagement.repository;

import com.suresh.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Search by first name (case-insensitive)
    List<Student> findByFirstNameContainingIgnoreCase(String firstName);

    // Search by last name (case-insensitive)
    List<Student> findByLastNameContainingIgnoreCase(String lastName);

    // Search by department
    List<Student> findByDepartmentContainingIgnoreCase(String department);

    // Search by email
    Student findByEmail(String email);

    // Search by first name OR last name
    List<Student> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(String firstName, String lastName);
}