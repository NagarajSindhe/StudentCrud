package com.sindhe.student.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sindhe.student.crud.model.Student;
import com.sindhe.student.crud.model.repository.StudentRepository;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> listAllStudents() {
		return studentRepository.findAll();
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	public Student getStudent(long id) {
		return studentRepository.findById(id).get();
	}

	public void deleteStudent(long id) {
		studentRepository.deleteById(id);
	}
}
