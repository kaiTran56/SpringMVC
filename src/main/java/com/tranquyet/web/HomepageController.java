package com.tranquyet.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tranquyet.entity.People;
import com.tranquyet.entity.Student;
import com.tranquyet.entity.Teacher;

@Controller
public class HomepageController {

	@RequestMapping("/")

	public String showHomepage() {

		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		People people = (People) context.getBean("people");
		people.setTest();
		((ClassPathXmlApplicationContext) context).close();
		return "homepage";
	}

	@RequestMapping("/login")
	@ResponseBody
	public String login() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		People people = (People) context.getBean("people");
		((ClassPathXmlApplicationContext) context).close();
		return people.setTest();
	}

	@RequestMapping("/homepage")
	@ResponseBody
	public String greeting() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		People people = (People) context.getBean("people");
		((ClassPathXmlApplicationContext) context).close();
		return people.setTest();
	}

	@RequestMapping("/home/show")
	@ResponseBody
	public String showResult() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		Student student = (Student) context.getBean("student");
		((ClassPathXmlApplicationContext) context).close();
		return student.showMessage();
	}

	@RequestMapping("/home/show-result")
	@ResponseBody
	public String showResultIoC() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		Student student = (Student) context.getBean("student1");
		((ClassPathXmlApplicationContext) context).close();
		return student.showMessage();
	}

	@RequestMapping("home/profile")
	@ResponseBody
	public String showProfile() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		People people = (People) context.getBean("people-temp");
		((ClassPathXmlApplicationContext) context).close();
		return people.toString();
	}

	@RequestMapping("/home/show-position")
	@ResponseBody
	public String showPosition() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		Teacher teacher = (Teacher) context.getBean("teacher");
		((ClassPathXmlApplicationContext) context).close();
		return teacher.toString();

	}
}
