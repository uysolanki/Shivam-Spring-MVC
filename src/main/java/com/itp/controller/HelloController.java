package com.itp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itp.model.Student;
import com.itp.service.StudentService;

@Controller
public class HelloController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/test")
	public String test()
	{
		return "new-shivam";
	}
	
	@RequestMapping(value={"/","/hello","/index","/home"})
	public String home(Model model)
	{
		List<Student> studentList=studentService.studentList();
		model.addAttribute("students",studentList);
		return "student-list";
	}
	
	@RequestMapping("/showSingleStudent")
	public String showSingleStudent(Model model)
	{
		Student s1=studentService.getStudent();
		model.addAttribute("mystudent",s1);
		return "single-student";
	}
	
	@GetMapping("/StudentList")
	public String StudentList(Model model)
	{
		List<Student> studentList=studentService.studentList();
		model.addAttribute("students",studentList);
		return "student-list";
	}
	
	
//	@GetMapping("/StudentList")
//	public String StudentList(ModelMap model)
//	{
//		List<Student> studentList=studentService.studentList();
//		model.addAttribute("students",studentList);
//		return "student-list";
//	}
	
	
//	@GetMapping("/StudentList")
//	public ModelAndView StudentList()
//	{
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("student-list");
//		List<Student> studentList=studentService.studentList();
//		mav.addObject("students",studentList);
//		return mav;
//	}
	
	@RequestMapping("/addStudentForm")
	public String addStudentForm(Model model)
	{
		Student s1=new Student();
		model.addAttribute("student",s1);
		return "add-student";
	}
	
	@PostMapping("/saveStudentDetails")
	public String saveStudentDetails(@ModelAttribute Student s1,Model model)
	{
		model.addAttribute("studname",s1.getSname());
		System.out.println(s1);
		//return "confirm";
		return "redirect:/StudentList";
	}
}
