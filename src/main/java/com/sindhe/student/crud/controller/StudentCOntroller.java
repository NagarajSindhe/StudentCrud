package com.sindhe.student.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sindhe.student.crud.model.Student;
import com.sindhe.student.crud.service.StudentService;

@Controller
public class StudentCOntroller {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Student> listStudents = studentService.listAllStudents();
		model.addAttribute("listStudents", listStudents);

		return "index";
	}

	@RequestMapping("/new")
	public String showNewStudentPage(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);

		return "addstudent";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("product") Student student) {
		studentService.addStudent(student);

		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("updateStudent");
	    Student student = studentService.getStudent(id);
	    mav.addObject("student", student);	
	     
	    return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteStudent(@PathVariable(name = "id") int id) {
		studentService.deleteStudent(id);
	    return "redirect:/";       
	}

}
