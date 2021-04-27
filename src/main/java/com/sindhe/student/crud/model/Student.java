package com.sindhe.student.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentDetails")
public class Student {
	public Long id;
	private String studentName;
	private Integer age;
	private Integer classtsd;

	public Student() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getClasstsd() {
		return classtsd;
	}

	public void setClasstsd(Integer classtsd) {
		this.classtsd = classtsd;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param studentName
	 * @param age
	 * @param classtsd
	 */
	public Student(String studentName, Integer age, Integer classtsd) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.classtsd = classtsd;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", age=" + age + ", classtsd=" + classtsd + "]";
	}

}