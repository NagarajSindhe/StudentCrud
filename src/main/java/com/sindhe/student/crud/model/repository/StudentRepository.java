package com.sindhe.student.crud.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sindhe.student.crud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
