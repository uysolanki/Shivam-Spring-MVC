package com.itp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itp.model.Student;
import com.itp.repository.StudentRepository;

@Component
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student getStudent()
	{
		Student s1=new Student(18,"Virat",78.6);
		return s1;
	}

	public List<Student> studentList() {
		List<Student> students=studentRepository.studentList();	
		return students;
	}

	public void addStudent(Student s1) throws Exception
	{
		studentRepository.addStudent(s1);
	}
}
