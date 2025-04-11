package com.itp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.itp.model.Student;

@Component
public class StudentService {

	
	public Student getStudent()
	{
		Student s1=new Student(18,"Virat",78.6);
		return s1;
	}

	public List<Student> studentList() {
		List<Student> students=new ArrayList();
		Student s1=new Student(18,"Virat",78.6);
		Student s2=new Student(45,"Rohit",88.6);
		Student s3=new Student(33,"Hardik",98.6);
		Student s4=new Student(17,"Rishab",89.6);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		return students;
	}
}
